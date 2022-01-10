package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class AddCycle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = -1;
    int c = -1;
    int count = 0;
    int temp = a;
    while(step(b,c) != a) {
      b = temp / 10;
      c = temp % 10;
      temp = step(b,c);
      count++;
    }
    System.out.println(count);
  }

  public static int step(int a, int b) {
    if (a + b < 10)
      return b * 10 + (a + b);
    else if (a + b >= 10) {
      return b * 10 + ((a + b) % 10);
    }
    else return 0;
  }

}