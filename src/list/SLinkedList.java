package list;

public class SLinkedList {
  //  인스턴스 변수
  private Node head;
  private int size;

  //  생성자
  public SLinkedList() {
    head = null;
    size = 0;
  }

  //  탐색, 추가, 삭제 연산 메서드
  public void addFirst(Node newNode) {
    head = newNode;
    size++;
  }

  public int size() {
    return size;
  }
}
