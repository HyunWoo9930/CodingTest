package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class BuyCard {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    int[] d = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      d[i] = -1;
      for(int j = 1;j <= i;j++) {
        if(d[i] == -1 || d[i] > d[i-j] + arr[j]) {
          d[i] = d[i-j] + arr[j];
        }
      }
    }
    System.out.println(d[n]);
  }
}
