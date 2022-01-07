package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class SquareMin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int e = Math.abs(a - 0);
    int f = Math.abs(b - 0);
    int i = Math.abs(c - a);
    int k = Math.abs(d - b);

    int min = 10000;
    min = Math.min(min,e);
    min = Math.min(min,f);
    min = Math.min(min,i);
    min = Math.min(min,k);
    System.out.println(min);
  }
}
