package CodingTest.Level1.Solved;

public class CodingTest_middleChar {
  public static void main(String[] args) {
    String s = "asdasdafd";
    int sLength = s.length();
    String answer = "";
    if(sLength % 2 == 0) {
      answer = s.substring(sLength/2-1,(sLength/2) + 1);
    }
    else {
      answer = s.substring(sLength/2,sLength/2+1);
    }
    System.out.println(answer);
  }
}
