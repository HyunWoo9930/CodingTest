package CodingTest.Programmers.Level1.Solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTest_hide_phonenum {
  public static void main(String[] ar) {
    String phone_number = "01033334444";
    int phone_num = phone_number.length();
    String answer = "";
    Pattern pattern = Pattern.compile("(\\w{4}$)");
    for(int i = 0;i<phone_num-4;i++) {
      answer += "*";
    }
    Matcher matcher = pattern.matcher(phone_number);
    if(matcher.find()) {
      answer += matcher.group(1);
    }
    System.out.print(answer);
  }
}
