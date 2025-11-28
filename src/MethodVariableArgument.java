public class MethodVariableArgument {
  public static void main(String[] args) {
    sayCongrats("Jhon Doe", 75,20,35);
  }

  static void sayCongrats(String name,int... values){
    int total = 0;
    for(var value : values){
      total += value;
    }
    int finalValue = total/values.length;
    if (finalValue >= 75) {
      System.out.println("Selamat" + " " + name + " " + "Anda lulus");
    }else {
      System.out.println("coba lagi jangan pernah menyerah!");
    }
  };
}
