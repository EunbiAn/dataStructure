
//List를 구성하는 Node 클래스
class DCNode <E> {
    private E item;    // 데이터 저장 변수
    private DCNode<E> next;    // 다른 노드를 참조할 링크 노드
    private DCNode<E> previous; //이전 노드를 참조할

    //생성자
    public DCNode() {
        this.item = null;
        this.next = null;
    }

    public DCNode(E newItem) {
        this.item = newItem;
        this.next = null;
    }

    public DCNode(E newItem, DCNode<E> p, DCNode<E> q) {
        item = newItem;
        previous = p;
        next = q;
    }

    //get과 set 메소드
    public E getItem() { return item; }
    public DCNode<E> getPrevious(){ return previous; }
    public DCNode<E> getNext(){ return next; }
    public void setItem(E newItem) { item = newItem; }
    public void setPrevious(DCNode<E> p) { previous = p; }
    public void setNext(DCNode<E> q) { next = q; }

}