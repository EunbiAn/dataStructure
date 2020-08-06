import java.util.NoSuchElementException;

public class DCList <E> {

    protected DCNode last;    //리스트의 마지막 노드를 가리킴
    public int size;

    // LinkedList 생성자
    public DCList() {
        last = null;    // head 노드 초기화
        size = 0; //size 0으로 초기화
    }
/*
    //target 탐색
    public DCNode search(E target){
        DCNode p = head;
        for(int k = 0; k < size; k++){
            if(target == p.getItem()){
                return p;
            }
            p=p.getNext();
        }
        return null; //탐색을 실패한 경우 -1 리턴
    }
*/
    public void insert(E newItem){      // last가 가리키는 노드의 다음에 새노드 삽입
        DCNode newNode = new DCNode(newItem, null,null);
        if( last == null){ //리스트가 empty일때
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            last = newNode;
        }
        else{
            DCNode current = last;
            DCNode prev = current.getPrevious();

            newNode.setPrevious(prev);
            newNode.setNext(current);
            current.setPrevious(newNode);
            prev.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    // last가 가리키는 노드의 다음 노드를 제거
    public DCNode delete(){
        // if(isEmpty()) throw new NoSuchElementException();
        DCNode x = last.getNext();
        if(x == last){
            last = null;
        }else{
            last.setNext(x.getNext());
            x.setNext(null);
        }
        size--;
        return x;
    }

    // p가 가리키는 노드의 다음 노드를 삭제
    public void deleteAfter(DCNode p){
        if(p == null) throw new NoSuchElementException();
        DCNode t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }


    void printList() {
        if (last == null) {

        } else {
            DCNode current = last;
            while (current.getNext() != null) {
                System.out.print(current.getItem() + " ");
                current = current.getNext();
            }
            System.out.println(current.getItem());
        }

    }

    public E getNode(DCNode current){
        return (E) current.getItem();
    }


}