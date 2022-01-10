package CodingTest.Programmers.Level1.Solved;

public class CodingTest_StringLength {
  public static void main(String[] ar) {
    String s = "a234";
    Boolean answer ;
    if (s.length() == 4 || s.length() == 6) {
      answer = true;
      s = s.replaceAll("[0-9]", "");
      if (s.length() != 0) {
        answer = false;
      }
      System.out.println(answer);
    }
  }
}
