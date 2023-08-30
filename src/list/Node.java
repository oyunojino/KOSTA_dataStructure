package list;

public class Node<E> {
  private E item;
  private E next;

  public Node(E item) {
    this.item = item;
  }

  public E getItem() {
    return item;
  }

  public void setItem(E item) {
    this.item = item;
  }

  public E getNext() {
    return next;
  }

  public void setNext(E next) {
    this.next = next;
  }
}
