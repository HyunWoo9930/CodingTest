package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class Star_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for(int i = a;i>0;i--) {
      String b = "";
      for(int j = i-1;j>0;j--) {
        b += " ";
      }
      for(int j = -1;j<a-i;j++) {
        b += "*";
      }
      System.out.println(b);
    }
  }
}
