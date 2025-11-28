public class OperasiBoolean {
  public static void main(String[] args) {
    var absen = 75;
    var resultValue = 80;
    
    var lulusAbsen = absen >= 75;
    var lulusNilai = resultValue >= 80;
    var lulus = lulusAbsen && lulusNilai;
    System.out.println(lulus);

  }
}
