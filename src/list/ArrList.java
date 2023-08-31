package list;


public class ArrList<E> {
  //  인스턴스 변수
  private E a[]; // private E a;
  private int size;

  //  생성자
  public ArrList() {
//    Object[] a = new Object[1];
//    # 위 문장을 제네릭으로 표현
    a = (E[]) new Object[1];
    size = 0;
  }

  public int size() {
    return size;
  }

  public E get(int k) {
    if (size == 0) throw new IndexOutOfBoundsException();
    return a[k];
  }

  public boolean add(E e) {
//    # 오버플로우 고려 x
//    a[size] = e;
//    size++;
//    return true;

//    # 오버플로우 고려 o
    if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }
    a[size++] = e;
    return true;
  }

  public void add(int index, E e) {
    if (a.length == size) {
      //throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }
    for (int i = size - 1; i >= index; i--) {
      //for (int i = index; i < size -1  ; i++) {
      a[i + 1] = a[i];
    }
    a[index] = e;
    size++;
  }

  public E remove() {
    if (size == 0) {
      throw new IndexOutOfBoundsException();
    }

    E tobeDeleted = a[size - 1];
    a[size - 1] = null;
    size--;

    if (size > 0 && size == a.length / 4) {
      resize(a.length / 2);
    }
    return tobeDeleted;
  }

  public E remove(int index) { // removeLast
    if (size == 0)
      throw new IndexOutOfBoundsException();
    E tobeDeleted = a[index];
    a[index] = null;
    for (int i = index + 1; i < size; i++) {
      a[i - 1] = a[i];
    }
    size--;
    if (size > 0 && size == a.length / 4) {
      resize(a.length / 2);
    }
    return tobeDeleted;
  }

  public <E> int indexof(E e) {
    int index = -1;
    for (int i = 0; i < a.length; i++) {
      if (e == a[i]) {
        index = i;
        break;
      }
    }
    return index;
  }


  private void resize(int newSize) {
    E[] t = (E[]) new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = t;
  }
}
