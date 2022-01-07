package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class wlrrkrtkarkrgud {
// 직각삼각형
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int a = sc.nextInt();
      if(a == 0) break;
      int b = sc.nextInt();
      int c = sc.nextInt();
      qltqus(a,b,c);
    }
  }
  public static void qltqus(int a,int b,int c) {
    int max = Math.max(a,Math.max(b,c));
    if(max == a) {
      if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
    else if(max == b) {
      if (Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
    else if(max == c) {
      if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}