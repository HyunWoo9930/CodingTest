package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class CutLan {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int N = sc.nextInt();
    int[] lans = new int[K];

    long high = 0;

    for (int i = 0; i < K; i++) {
      lans[i] = sc.nextInt();
      if (high < lans[i]) {
        high = lans[i];
      }
    }

    high++;
    long low = 0;
    long mid;

    while (low < high) {
      mid = (high + low) / 2;
      if (Count(lans, mid) < N) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    System.out.println(low - 1);
  }

  public static long Count(int[] arr, long val) {
    long count = 0;
    for (int i : arr) {
      count += (i / val);
    }
    return count;
  }
}
