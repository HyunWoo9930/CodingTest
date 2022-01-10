package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String e = sc.nextLine();
    for(int i = 0;i<a;i++) {
      e = sc.nextLine();
      Pattern pattern = Pattern.compile("(\\d) ([\\/\\w]*)");
      Matcher matcher = pattern.matcher(e);

      int b = 0;
      String c = "";
      if(matcher.find()) {
        b = Integer.parseInt(matcher.group(1));
        c = matcher.group(2);
      }
      String result = "";
      String[] d = c.split("");
      for(int j = 0;j<d.length;j++) {
        for(int k = 0;k<b;k++) {
          result += d[j];
        }
      }
      System.out.println(result);
    }
  }
}