import java.io.IOException;
import java.util.Scanner;

public class home {
    public static void main(String []args) {

        pritMenu(); //메뉴출력
        Function(); //기능 작동
    }

    static void pritMenu() {//메뉴출력
        System.out.println("===========================================");
        System.out.println("(1) 새 학생 입력 ");
        System.out.println("(2) 학생 삭제");
        System.out.println("(3) 학번 순으로 전체 출력");
        System.out.println("(4) 파일에 저장하고 종료");
        System.out.println("===========================================");
    }

    static void Function() {
        SList <Student> slist = new SList<Student>();
        Scanner sc = new Scanner(System.in);
        int stNumber =0;
        String name = "";
        String circle = "";

        while(true){ //기능 선택받기
            System.out.print("원하는 기능을 선택하세요 : ");
            int number = sc.nextInt();
            switch(number){
                case 1 :
                    System.out.print("학번과 이름, 동아리들을 입력하세요 : ");
                    stNumber = sc.nextInt(); //학번
                    name = sc.nextLine(); //이름
                    circle = sc.nextLine();//동아리
                    //동아리 리스트에 넣기
                    String[] c_array = circle.split("/"); // 동아리가 여러개 일 떄  /를 기준으로 나누기
                    SList <Circles> clist = new SList<Circles>();
                    for(int i=0; i< c_array.length; i++){
                        Circles cr = new Circles(c_array[i]);
                        clist.insertFront(cr);
                    }
                    // 학생 리스트에 넣기
                    Student st = new Student(stNumber, name,clist);
                    slist.insertFront(st);
                    break;

                case 2 :
                    System.out.print("학번을 입력하세요 :");
                    stNumber = sc.nextInt();    // 삭제 하고 싶은 학생의 학번

                    // 해당 학번을 가진 Student 클래스를 노드로 가진 리스트 찾기
                    Node cur = slist.head;
                    Node pre = null;  // 이전 노드를 가리킴
                    for(int i = 0; i < slist.size ; i++){
                        if(stNumber!= slist.getNode(cur).getStNumber()) {
                            System.out.println(cur);
                            pre = cur;
                            cur = cur.getNext();
                        }
                        else {
                            if(pre != null){
                                slist.deleteAfter(pre);
                            } else{
                                slist.deleteFront();
                            }
                        }
                    }
                    break;

                case 3:
                    slist.printList();//출력하기
                    break;

                case 4:
                    System.out.println("종료합니다.");
                    System.exit(0) ; //종료하기
                    break;

                default:
                    System.out.println("숫자를 다시 입력해주세요.");
                    break;
            }
        }
    }
}



