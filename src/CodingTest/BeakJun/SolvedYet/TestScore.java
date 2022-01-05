package CodingTest.BeakJun.SolvedYet;

import java.util.Scanner;

public class TestScore {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int minkuk = (a+b+c+d);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    int manse = (a+b+c+d);
    System.out.println(Math.max(minkuk,manse));
  }

}
