package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 최소공배수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for(int i = 0;i<t;i++) {
      String str = br.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);
      bw.write((a * b) / glc(a,b) + "\n");
    }
    bw.flush();
  }
  public static int glc(int a,int b) {
    if(b == 0) {
      return a;
    } else {
      return glc(b,a%b);
    }
  }

}
