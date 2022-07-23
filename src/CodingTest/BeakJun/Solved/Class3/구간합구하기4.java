package CodingTest.BeakJun.Solved.Class3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 구간합구하기4 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] nums = new int[N+1];
    nums[0] = 0;
    nums[1] = sc.nextInt();
    for(int i = 2; i <= N; i++) {
      nums[i] = nums[i-1] + sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
      int first = sc.nextInt() -1 ; // 0
      int end = sc.nextInt(); // 3
      int result = nums[end] - nums[first];
      bw.write(result + "\n");
    }
    bw.flush();
  }
}
