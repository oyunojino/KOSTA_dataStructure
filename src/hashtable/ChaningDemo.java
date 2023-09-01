package hashtable;

public class ChaningDemo {
  public static void main(String[] args) {
    Chaining<Integer, Integer> c = new Chaining<>();
    c.put(10, "A");
    c.put(23, "B");
    c.put(36, "C");

    System.out.println(c.get(36));
    System.out.println(c);

    Chaining<Integer, Integer> c2 = new Chaining<>();
//    c2.put();
  }
}
