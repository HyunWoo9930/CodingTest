package CodingTest.Programmers.Level1.Solved;

import java.util.Scanner;

public class CodingTest_SquareStars {
  public static void main(String[] ar) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i = 0;i<b;i++) {
      for(int j = 0;j<a;j++) {
        System.out.print("*");
      }
      System.out.println();
    }


  }

}
