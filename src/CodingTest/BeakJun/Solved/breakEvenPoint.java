package CodingTest.BeakJun.Solved;

import java.util.Scanner;

public class breakEvenPoint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long i = 0;
    if (b > c) {
      System.out.println(-1);
    } else {
      while ((a + (b * i) > c * i)) {
        i++;
      }
      i++;
      System.out.println(i);

    }
  }
}
