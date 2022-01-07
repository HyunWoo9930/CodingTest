package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class average {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();

    int max = 0;
    int sum = 0;
    for(int i = 0;i<a;i++) {
      int b = sc.nextInt();
      max = Math.max(max,b);
      sum += b;
    }
    double c = (double)sum/max * 100 / a;
    System.out.println(c);
  }
}
