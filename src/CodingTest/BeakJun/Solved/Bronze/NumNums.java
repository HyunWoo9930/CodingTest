package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class NumNums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    String result = String.valueOf(a * b * c);
    for(int i = 0;i<10;i++) {
      System.out.println(countChar(result,String.valueOf(i)));
    }
  }
  public static int countChar(String str, String ch) {
    return str.length() - str.replace((ch), "").length();
  }
}
