
class Student{
    private int stNumber;   //학번
    private String name;       //이름
    private SList<Circles> circles;    //동아리 리스트

    public Student() { }

    public Student(int stNumber, String name, SList circles) {
        this.stNumber=stNumber;
        this.name=name;
        this.circles=circles;
    }

    int getStNumber(){
        return stNumber;
    }

    public String toString(){
        circles.printList();
        return stNumber +" "+ name +" \n";
    }

}