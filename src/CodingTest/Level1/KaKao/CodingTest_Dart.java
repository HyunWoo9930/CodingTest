package CodingTest.Level1.KaKao;

public class CodingTest_Dart {

  public static void main(String[] args) {
    String DartResult = "1S2D*3T";
    String[] DartResults = DartResult.split("[*#]");
    for(int i = 0;i<DartResults.length;i++) {
      String[] splitDartResults = DartResults[i].split("\\w{2}");
      for(int j = 0;j<splitDartResults.length;j++) {
        System.out.println(splitDartResults[i]);

      }
    }



  }

}
