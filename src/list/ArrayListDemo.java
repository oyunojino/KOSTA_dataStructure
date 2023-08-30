package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
  public static void main(String[] args) {
//               | 추가/삭제 | 인덱스 조회
//    ----------------------------------
//    ArrayList  |   느림   |     빠름
//    LinkedList |   빠름   |     느림


//    # ArrayList
//    - 고정 크기 o, 추가할 때마다 점점 커짐
//    - Array와 List의 장점만 가짐
//    - 검색을 할 때 유용
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println(numbers);

    numbers.remove(3);
    System.out.println(numbers);

    System.out.println(numbers.get(2));


    System.out.println("--------------------------");
//    # LinkedList
//    - 고정 크기 x, 추가할 때마다 점점 커짐
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(100);
    ll.add(200);
    ll.add(300);
    ll.add(400);
    System.out.println(ll);

    ll.remove(2);
    System.out.println(ll);

    System.out.println(ll.get(2));
  }
}
