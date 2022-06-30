package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class DirectorShom {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int t = 666;
    while (n != count) {
      if ( String.valueOf(t).contains("666")) {
        count++;
      }
      t++;
    }
    System.out.println(t-1);
  }
}
