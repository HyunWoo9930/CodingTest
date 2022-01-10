package CodingTest.BeakJun.Solved.Bronze;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class APlusB_4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str;
    while((str = br.readLine()) != null) {
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);
      System.out.println(a+b);
    }
  }
}
