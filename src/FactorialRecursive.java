public class FactorialRecursive {
  public static void main(String[] args) {
    System.out.println(FactorialRecursive(10));
  }
  static int FactorialRecursive(int value){
      if (value == 1) {
        return 1;
      }else{
        return value * FactorialRecursive(value -1);
      }
  }
}
