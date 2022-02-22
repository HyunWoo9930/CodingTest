package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NumCard2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int m = Integer.parseInt(br.readLine());
    int[] mArr = new int[m];
    String M = br.readLine();
    for (int i = 0; i < m; i++) {
      mArr[i] = Integer.parseInt(M.split(" ")[i]);
    }
    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];
    String N = br.readLine();
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(N.split(" ")[i]);
    }
    Arrays.sort(mArr);
    System.out.println(Arrays.toString(mArr));
    for (int b : nArr) {
      System.out.println();
    }
  }
}