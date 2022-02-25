package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치함수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] one = new int[100000];
    int[] zero = new int[100000];

    one[0] = 0;
    zero[0] = 1;
    one[1] = 1;
    zero[1] = 0;
    zero[2] = 1;
    for (int i = 2; i < one.length; i++) {
      one[i] = one[i - 1] + one[i - 2];
    }
    for (int i = 3; i < zero.length; i++) {
      zero[i] = zero[i - 1] + zero[i - 2];
    }
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(br.readLine());
      bw.write(zero[a] + " " + one[a] + "\n");
    }
    bw.flush();
  }
}
