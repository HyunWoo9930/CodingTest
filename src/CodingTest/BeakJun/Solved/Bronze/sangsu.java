package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class sangsu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(Math.max(reverse(a),reverse(b)));
  }
  public static int reverse(int a) {
    int b = a / 100;
    int c = (a - (b*100)) / 10;
    int d = a % 10;
    return (d * 100) + (c* 10) + b;
  }
}
