package list;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    System.out.println("-----------------------------");
    System.out.println("          ArrList");
    System.out.println("-----------------------------");
    ArrList<Integer> list = new ArrList<>();
    System.out.println(list.size());
    list.add(10);
    System.out.println(list.get(0));
    list.add(20);
    System.out.println(list.get(1));
    list.add(30);
    list.add(40);
    System.out.println(list.size());

    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
//    System.out.println(list.remove() + "가 삭제됨"); // 오류 : 범위 넘어감
    System.out.println(list.size());



    System.out.println("-----------------------------");
    System.out.println("          ArrayList");
    System.out.println("-----------------------------");
    ArrayList<Integer> aList = new ArrayList<>();
    System.out.println(aList.size());
    aList.add(10);
    System.out.println(aList.get(0));
    System.out.println(aList.size());

    aList.add(10);
    aList.add(20);
    aList.add(30);
    aList.add(40);
    aList.remove(aList.size()-1);
    aList.remove(aList.size()-1);

    System.out.println(aList.remove(1));
    System.out.println(aList);
  }
}
