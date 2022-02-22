package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class tiling {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int[] d = new int[a + 1];
    d[0] = 1;
    d[1] = 3;
    for(int i = 2; i<a;i++) {
      d[i] = d[i-1] + 2*d[i-2];
      d[i] = d[i] % 10007;
    }
    System.out.println(d[a-1]);
  }
}
