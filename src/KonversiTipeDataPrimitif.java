public class KonversiTipeDataPrimitif {
  public static void main(String[] args) {
    int age = 30;
    Integer ageObject = age;
    int again = ageObject;
    short shortAge = ageObject.shortValue();
    byte byteAge = ageObject.byteValue();

    System.out.println(again);
    System.out.println(shortAge);
    System.out.println(byteAge);
  }
}
