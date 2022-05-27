package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 가장긴증가하는부분수열 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    String str = br.readLine();
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(str.split(" ")[i]);
    }

    int[] d = new int[n];
    d[0] = 1;
    for(int i = 1; i < n; i++) {
      if(a[i] > a[i-1]) {
        d[i] += d[i-1];
        d[i]++;
      } else {
        for(int j = 2;j <= i;j++) {
          if(a[i] > a[i-j]) {
            d[i] += d[i-j];
            d[i]++;
            break;
          }
        }
      }
    }

    int max = 1;
    for(int i = 0; i < d.length; i++) {
      max = Math.max(max,d[i]);
    }
    System.out.println(max);
  }
}
