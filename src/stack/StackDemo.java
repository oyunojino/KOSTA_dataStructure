package stack;

import java.util.Stack;

public class StackDemo {
//  # Stack( LIFO )
//  - 메모리 안의 데이터를 효율적으로 관리하게 도와주는 자료 참조 방식

  // Stack => 구현클래스
  public static void main(String[] args) {
    System.out.println("=== Stack ===");
    Stack<Integer> s = new Stack<>();
//    s.peek();
    s.push(10);
    s.push(20);
    s.push(30);
    while (!s.empty()) {
      System.out.println(s.pop() + "가 삭제됨");
    }

    ListStack<String> ls = new ListStack<>();
    System.out.println("=== ListStack ===");
    System.out.println("push : " + ls.push("A"));
    ls.push("B");
    ls.push("C");
    System.out.println("peek : " + ls.peek());
    while(!ls.isEmpty()) {
      System.out.println(s.pop() + "이 삭제됨");
    }
  }
}
