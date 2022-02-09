package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HidenSeek6 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String str = br.readLine();
    long n = Long.parseLong(str.split(" ")[0]);
    long s = Long.parseLong(str.split(" ")[1]);
    long[] Arr = new long[(int)n];
    str = br.readLine();
    String[] ar = str.split(" ");
    for(int i = 0; i<n;i++) {
      Arr[i] = Math.abs(s - Long.parseLong(ar[i]));
    }
    long ans = Arr[0];
    for(int i = 1;i<n;i++) {
      ans = gcb(ans,Arr[i]);
    }
    bw.write(ans + "\n");
    bw.flush();
  }

  public static long gcb(long a,long b) {
    if (b == 0) {
      return a;
    } else {
      return gcb(b,a%b);
    }
  }
}
