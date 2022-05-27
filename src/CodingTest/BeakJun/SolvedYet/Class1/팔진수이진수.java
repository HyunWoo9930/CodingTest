package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팔진수이진수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    for(int i = 0;i<str.length();i++) {
      String a = Integer.toBinaryString(Integer.parseInt(String.valueOf(str.charAt(i))));
      if (i == 0) {
        System.out.print(a);
      }
      else if(a.length() != 3) {
        while (a.length() != 3) {
          a += "0";
        }
        StringBuilder ab = new StringBuilder();
        ab.append(a);
        ab.reverse();
        System.out.print(ab);
      } else
      System.out.print(a);
    }
  }
}
