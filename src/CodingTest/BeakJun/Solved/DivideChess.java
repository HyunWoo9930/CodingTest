package CodingTest.BeakJun.Solved;

import java.util.Scanner;

public class DivideChess {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a / 2;
    int c = a - b;
    System.out.println((b+1) * (c+1));
  }

}
