package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class Music {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = "";
    for(int i = 0;i<8;i++) {
      a += String.valueOf(sc.nextInt());
    }
    System.out.println((a.equals("12345678"))? "ascending" : (a.equals("87654321")) ? "descending" : "mixed");
  }
}