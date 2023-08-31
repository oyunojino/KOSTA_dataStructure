package stacknqueue;

import stacknqueue.Node;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;
  public ListQueue(){
    front = null;
    rear = null;
    size = 0;
  }
  // size , isEmpty, peek
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }

  public E peek(){
    return front.getItem();
  }
  // add ==> addLast (h,t)
  public boolean add(E e){
    Node<E> newNode = new Node<>(e);
    if(size == 0) {
      front = newNode;
    } else {
      rear.setNext(newNode);
    }
    rear = newNode;
    size++;
    return true;
  }
  // poll ==> removeFirst (h,t)
  public E poll(){
    E delItem = front.getItem();
    if(front.getNext() == null){
      front = rear = null;
    } else {
      front = front.getNext();
    }
    size--;
    return delItem;
  }
}