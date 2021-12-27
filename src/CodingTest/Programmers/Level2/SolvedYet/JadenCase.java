package CodingTest.Programmers.Level2.SolvedYet;

public class JadenCase {

  public static void main(String[] args) {
//    String s = "3people unFollowed me";
    String s = "adgagd 3eagdag ";
    String answer = "";
    s = s.toLowerCase();
    String[] sArray = s.split(" ");
    for(int i = 0;i< sArray.length;i++) {
      answer += sArray[i].substring(0,1).toUpperCase() + sArray[i].substring(1) + " ";
    }
    answer = answer.substring(0,answer.length()-1);
    System.out.println(answer);
  }
}
