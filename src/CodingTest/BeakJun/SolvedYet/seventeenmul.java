package CodingTest.BeakJun.SolvedYet;

import java.util.Scanner;

public class seventeenmul {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    long b = Integer.parseInt(a,2);
    b *= 17;
    System.out.println(Long.toBinaryString(b));
  }

}
