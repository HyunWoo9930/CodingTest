package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class add123 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] arr = new int[12];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 4;
    for(int i = 3; i < 12; i++) {
      arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
    }
    for(int i = 0;i<t;i++) {
      int n = sc.nextInt();
      System.out.println(arr[n-1]);
    }
  }
}