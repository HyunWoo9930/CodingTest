package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAPlusB {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(bf.readLine());

    for(int i = 0;i<N;i++) {
      String str = bf.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);
      bw.write(a+b + "\n");
    }
    bw.flush();
  }
}