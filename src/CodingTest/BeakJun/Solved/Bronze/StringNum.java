package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    Pattern pattern = Pattern.compile(" *\\w+");
    Matcher matcher = pattern.matcher(a);
    int  b= 0;
    while(matcher.find()) {
      b++;
    }
    System.out.println(b);
  }
}
