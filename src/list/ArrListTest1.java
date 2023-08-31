package list;

import java.util.ArrayList;

public class ArrListTest1 {
  public static void main(String[] args) {
    ArrList1<Integer> list = new ArrList1<>();
    System.out.println(list.size());
    list.add(10);
    System.out.println(list.get(0));
    list.add(0,15);
    System.out.println(list.size());
    list.add(20);
    //list.get(3);

    System.out.println(list.size());
    list.add(30);
    list.add(40);
    list.add(50);

    System.out.println(list.size());
    for (int i = 0 ; i < list.size() ; i++) {
      System.out.print(list.get(i));
    }
    System.out.println();
    System.out.println(list.indexOf(30));
    System.out.println(list.indexOf(60));
    System.out.println(list.remove(1) +"가 삭제됨");
    System.out.println(list.remove(1) +"가 삭제됨");
    System.out.println(list.remove(1) +"가 삭제됨");
    System.out.println(list.remove(1) +"가 삭제됨");
    System.out.println(list.remove(1) +"가 삭제됨");
    System.out.println(list.size());

    ArrayList<Integer> aList = new ArrayList<>();
    System.out.println(aList.size());
    aList.add(10);
    aList.add(20);
    aList.add(30);
    aList.add(40);
    //aList.get(10);

    aList.remove(aList.size()-1);
    aList.remove(aList.size()-1);
    System.out.println(aList.get(0));
    System.out.println(aList.size());
  }
}