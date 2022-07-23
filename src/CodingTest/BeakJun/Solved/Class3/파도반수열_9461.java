package CodingTest.BeakJun.Solved.Class3;

import java.util.Scanner;

public class 파도반수열_9461 {
  /*
  개 쉬운 다이나믹 프로그래밍
  */

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    long[] P = new long[101];
    StringBuilder stringBuilder = new StringBuilder();
    P[0] = 1;
    P[1] = 1;
    P[2] = 1;
    P[3] = 2;
    P[4] = 2;
    for(int i = 5; i < P.length; i++) {
      P[i] = P[i-1] + P[i-5];
    }

    for(int i = 0; i < T; i++) {
      stringBuilder.append(P[sc.nextInt()-1]).append("\n");
    }
    System.out.println(stringBuilder);
  }
}
