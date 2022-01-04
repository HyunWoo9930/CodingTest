package CodingTest.BeakJun.Solved;

import java.util.Scanner;

public class OvenClock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(c >= 60) {
      a += (c/60);
      b += (c%60);
      if(b >= 60) {
        a += (b/60);
        b = (b%60);
      }
    }
    else {
      b += c;
      if(b >= 60) {
        a += (b/60);
        b = (b%60);
      }
    }
    System.out.println((a%24) + " " + b);
  }

}
