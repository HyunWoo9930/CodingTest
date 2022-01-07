package CodingTest.BeakJun.SolvedYet.Class1;

import java.util.Scanner;

public class MinX {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] result = new int[N];

    for(int i = 0;i<N;i++) {
      result[i] = sc.nextInt();
    }

    for(int i = 0;i<N;i++) {
      if (X > result[i]) {
        System.out.print(result[i]);
      } else continue;
      System.out.print(" ");
    }
  }
}