package CodingTest.BeakJun.Solved;

import java.util.Scanner;

public class copyright {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double c = a * b;
    while(c/a > (b-1)) {
      --c;
    }
    c++;
    System.out.println((int)c);
  }

}
