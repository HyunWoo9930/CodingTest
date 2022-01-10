package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class APlusB_7 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());

    for(int i = 0;i<a ; i++) {
      String str = br.readLine();
      int b = Integer.parseInt(str.split(" ")[0]);
      int c = Integer.parseInt(str.split(" ")[1]);
      bw.write("Case #" + (i+1) + ": " + b + " + "+ c + " = "+(b+c) + "\n");
    }
    bw.flush();
  }
}
