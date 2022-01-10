package CodingTest.Programmers.Level2.SolvedYet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RightBlank {

  public static void main(String[] args) {
    String s = "";
    Pattern pattern = Pattern.compile("(\\(\\))");
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()) {
      s = s.replaceAll("\\(\\)", "");
      System.out.println("s = " + s);
    }
    boolean answer = (!(s.contains("(") | s.contains(")")));
    System.out.println("answer = " + answer);
  }

}
