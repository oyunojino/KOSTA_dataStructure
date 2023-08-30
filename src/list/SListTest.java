package list;


public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(10);
    Node<Integer> node1 = new Node<>(10);
    Node<Integer> node2 = new Node<>(10);
    sl.addFirst(node);
    sl.addFirst(node1);
    sl.addFirst(node2);
    System.out.println(sl.size());
  }
}
