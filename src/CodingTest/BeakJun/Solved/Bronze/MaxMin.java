package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class MaxMin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int max = -1000000;
    int min = 1000000;
    for(int i = 0;i<a;i++) {
      int b = sc.nextInt();
      max = Math.max(max,b);
      min = Math.min(min,b);
    }
    System.out.println(min + " " + max);
  }
}