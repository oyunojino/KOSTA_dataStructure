package stack;

import stack.ListStack;


public class ReverseDemo {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    String[] ops = {"8","3","2","+","1","-","/"};
    int num1 = 0, num2 = 0, res = 0;

    for (String op : ops) {
      if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
        // pop을 두 번 수행한다.
        num2 = Integer.parseInt(stack.pop());
        num1 = Integer.parseInt(stack.pop());
        // 계산을 수행한 후 다시 스택에 넣는다.
        res = calculation(num1, op, num2);
        stack.push(String.valueOf(res));
      } else {
        // 피연산자이면 스택에 push 한다.
        stack.push(op);
      }
    }
    // 스택에 있는 것이 최종 결과이다.
    if(!stack.isEmpty()) {
      System.out.println("계산결과는 " + stack.pop()+ "입니다.");
    }
  }

  // 계산식 수행 메서드
  public static int calculation(int num1, String op, int num2){
    int result = 0;
    switch (op) {
      case "+" :
        result = num1 + num2;
        break;
      case "-" :
        result = num1 - num2;
        break;
      case "*" :
        result = num1 * num2;
        break;
      case "/" :
        result = num1 / num2;
        break;
    }
    return result;
  }
}