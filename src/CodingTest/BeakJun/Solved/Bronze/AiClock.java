package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class AiClock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if(d >= 60) {
      b += (d / 60);
      c += (d % 60);
      if(c >= 60) {
        b += (c / 60);
        c = (c%60);
      }
      if(b >= 60) {
        a += (b / 60);
        b = (b%60);
      }
    }
    System.out.println((a%24) + " " + b + " " + c);

  }

}
