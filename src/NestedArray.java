public class NestedArray {
  public static void main(String[] args) {
    String[][] names = {
      {"Jhon Doe", "Steven", "Jordan"},
      {"Allice", "Eli", "Rose"},
      {"Robert", "Alex", "Jhonson"}
    };
    String[] member = names[0];
    System.out.println(member[0]);
    System.out.println(names[1][0]);
    System.out.println(names[2][3]);
    System.out.println(names.length);
  }
}
