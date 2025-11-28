public class Scope {
  public static void main(String[] args) {
    sayHello("Jhon Doe");
  }
  static void sayHello(String name){
    if (name.isBlank()) {
      String hi = "hi" + name;
      System.out.println(hi);
    }
  }
}
