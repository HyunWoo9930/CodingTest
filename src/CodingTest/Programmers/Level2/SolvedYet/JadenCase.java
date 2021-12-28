package CodingTest.Programmers.Level2.SolvedYet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {

  public static void main(String[] args) {
//    String s = "3people unFollowed me";
    String s = " aaaaa  aaa  ";
    String answer = "";
    s = s.toLowerCase();
    String[] sArray = s.split("");
    for(int i = 0;i< sArray.length-1;i++) {
      if(!sArray[i].isBlank() && !sArray[i+1].isBlank()) {
        System.out.println(true);
      }
    }
  }
}
