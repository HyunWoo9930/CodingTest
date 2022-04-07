package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CountingStar {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = sc.nextInt();
    int m = 0;
    while(n > 0) {
      StringBuilder str = new StringBuilder();
      str.append(" ".repeat(m));
      str.append("*".repeat(n));
      bw.write(str + "\n");
      n--;
      m++;
    }
    bw.flush();
  }
}
