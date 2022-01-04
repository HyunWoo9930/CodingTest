package CodingTest.BeakJun.Solved;

import java.util.Scanner;

public class SangGunBurger {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    a = Math.min(Math.min(a,b),c);
    d = Math.min(d,e);
    System.out.println(a + d - 50);

  }

}
