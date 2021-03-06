package CodingTest.BeakJun.Solved.Bronze;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SelfNumber {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = 10001;
    int sum = 0, i, x;
    boolean[] SN = new boolean[n];

    for(i = 1;i<n;i++) {
      x = i;
      sum = x;
      while(x!=0) {
        sum += x%10;
        x = x/10;
      }
      if(sum<=10000) {
        SN[sum] = true;
      }
    }

    i=1;
    while(i<=10000) {
      if(SN[i]!=true) bw.write(i+"\n");
      i++;
    }
    bw.flush();
  }
}