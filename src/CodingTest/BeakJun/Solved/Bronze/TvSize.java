package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class TvSize {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int bb = (int)Math.pow(b,2);
    int cc = (int)Math.pow(c,2);
    double result = a / Math.sqrt(bb+cc);
    System.out.println("result = " + result);
    System.out.println((int)Math.floor(result * b));
    System.out.println((int)Math.floor(result * c));

  }
}
