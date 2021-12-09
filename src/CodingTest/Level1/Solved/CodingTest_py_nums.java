package CodingTest.Level1.Solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTest_py_nums {

  public static void main(String[] ar) {
    String s = "pyy";
    String Ps = s.replaceAll("[^pP]","");
    String Ys = s.replaceAll("[^yY]","");
    Boolean answer = Ps.length() == Ys.length();
    System.out.println(answer);
  }

}
