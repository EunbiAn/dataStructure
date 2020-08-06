
//List를 구성하는 Node 클래스
class Node <E> {
    private E item;    // 데이터 저장 변수
    private Node<E> next;    // 다른 노드를 참조할 링크 노드

    //생성자
    public Node() {
        this.item = null;
        this.next = null;
    }

    public Node(E newItem) {
        this.item = newItem;
        this.next = null;
    }

    public Node(E newItem, Node<E> newNext) {
        this.item = newItem;
        this.next = newNext;
    }

    //get과 set 메소드
    public E getItem() {
        return item;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setItem(E newItem) {
        item = newItem;
    }
    public void setNext(Node<E> newNext) { next = newNext; }

}