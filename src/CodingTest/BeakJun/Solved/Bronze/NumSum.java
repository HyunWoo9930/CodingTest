package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumSum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    String str = br.readLine();
    String[] strArray = str.split("");
    int sum = 0;
    for (int i = 0; i < a; i++) {
      sum += Integer.parseInt(strArray[i]);
    }
    System.out.println(sum);
  }
}
