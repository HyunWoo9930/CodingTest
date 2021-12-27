package CodingTest.Programmers.Level1.Solved;

public class CodingTest_Kimsubang {
  public static void main(String[] ar) {
      String[] seoul = {"Jane","Kim"};
      String answer = "";
      for(int i = 0;i<seoul.length;i++) {
        if(seoul[i].equals("Kim")) {
          answer = "김서방은 " + i + "에 있다";
          break;
        }
      }
      System.out.println(answer);

  }
}
