package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pibonachi {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int first = 0;
    int second = 1;
    if(n== 0) {
      System.out.println(0);
    }
    if (n == 1) {
      System.out.println(1);
    } else {
      for (int i = 1; i < n; i++) {
        int temp = second;
        second += first;
        first = temp;
      }
      System.out.println(second);
    }
  }
}