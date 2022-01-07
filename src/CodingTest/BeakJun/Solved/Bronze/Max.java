package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class Max {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int maxNum = 0;
    for(int i = 0;i<9;i++) {
      int a = sc.nextInt();
      max = Math.max(max,a);
      if(max == a) maxNum = i+1;
    }
    System.out.println(max);
    System.out.println(maxNum);
  }
}