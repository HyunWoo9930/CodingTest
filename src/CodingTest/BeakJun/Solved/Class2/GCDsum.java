package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GCDsum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String str = br.readLine();
      int n = Integer.parseInt(str.split(" ")[0]);
      int[] nArr = new int[n];
      for (int j = 0; j < n; j++) {
        nArr[j] = Integer.parseInt(str.split(" ")[j+1]);
      }
      float result = 0;
      for(int j = 0;j<nArr.length-1;j++) {
        for(int k = j+1;k<nArr.length;k++) {
          result += GCD(nArr[j],nArr[k]);
        }
      }
      bw.write(result + "\n");
    }
    bw.flush();
  }
  public static int GCD(int a,int b) {
    if(b == 0) {
      return a;
    } else {
      return GCD(b,a%b);
    }
  }
}
