public class FactorialRecursive {
  public static void main(String[] args) {
    System.out.println(Factorial(10));
  }
  static int Factorial(int value){
      if (value == 1) {
        return 1;
      }else{
        return value * Factorial(value -1);
      }
  }
}
