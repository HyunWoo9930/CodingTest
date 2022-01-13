package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class chleorhddirtndhkchlthrhdqotn {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int a = Integer.parseInt(str.split(" ")[0]);
    int b = Integer.parseInt(str.split(" ")[1]);

    bw.write(FindSmall(a,b) + "\n");
    bw.write(FindMult(a,b,FindSmall(a,b)) + "\n");
    bw.flush();

  }

  public static int FindSmall(int a , int b) {
    int max = 0;
    int min = Math.min(a,b);

    for(int i = 1;i<=min;i++) {
      if(a % i == 0 && b % i == 0) {
        max = Math.max(max,i);
      }
    }
    return max;
  }

  public static int FindMult(int a,int b,int c) {
    return (a * b) / c;
  }

}
