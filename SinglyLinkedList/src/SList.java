import java.util.NoSuchElementException;

public class SList <E> {

    protected Node head;    //연결리스트의 첫 노드 가리킴
    public int size;

    // LinkedList 생성자
    public SList() {
        head = null;    // head 노드 초기화
        size = 0; //size 0으로 초기화
    }

    //target 탐색
    public Node search(E target){
        Node p = head;
        for(int k = 0; k < size; k++){
            if(target == p.getItem()){
                return p;
            }
            p=p.getNext();
        }
        return null; //탐색을 실패한 경우 -1 리턴
    }

    // 리스트 맨 앞에 새 노드삽입
    public void insertFront(E newItem){
        head = new Node(newItem, head);
        size++;
    }

    // 노드 p 바로 다음에 새 노드 삽입
    public void insertAfter(E newItem, Node p){
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }

    // 리스트의 첫 노드 삭제
    public void deleteFront(){
        // if(isEmpty()) throw new NoSuchElementException();
        head = head.getNext();
        size--;
    }

    // p가 가리키는 노드의 다음 노드를 삭제
    public void deleteAfter(Node p){
        if(p == null) throw new NoSuchElementException();
        Node t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }


    void printList() {
        if (head == null) {
            System.out.println("출력할 리스트가 존재하지 않습니다.");
        } else {
            Node current = head;
            while (current.getNext() != null) {
                System.out.print(current.getItem() + " ");
                current = current.getNext();
            }
            System.out.println(current.getItem());
        }

    }

    public E getNode(Node current){
        return (E) current.getItem();
    }


}