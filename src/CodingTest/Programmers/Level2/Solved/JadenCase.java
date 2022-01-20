package CodingTest.Programmers.Level2.Solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {

  public static void main(String[] args) {
//    String s = "3people unFollowed me";
//    String s = " aaaaa  aaa  ";
//    String s = "for the last week";
    String s = " adgagd 3eagdag ";
    String answer = "";
    s = s.toLowerCase();
    Pattern pattern = Pattern.compile(" *([\\w\\d]+) *");
    Matcher matcher = pattern.matcher(s);
    while(matcher.find()) {
      String upperCase = matcher.group(1).substring(0,1).toUpperCase() + matcher.group(1).substring(1);
      String upperCases = matcher.group(0).replaceAll(matcher.group(1),upperCase);
      answer += upperCases;
    }
  }
}
