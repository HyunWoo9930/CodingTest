package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 이진수팔진수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    String a = br.readLine();
    StringBuilder ans = new StringBuilder();
    for (int i = a.length() - 1; i >= 0; i -= 3) {
      int sum = 0;
      if (i == 1) {
        sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        sum += 2 * Integer.parseInt(String.valueOf(a.charAt(i - 1)));
        ans.append(sum);
      } else if (i == 0) {
        sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        ans.append(sum);
      } else {
        sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        sum += 2 * Integer.parseInt(String.valueOf(a.charAt(i - 1)));
        sum += 4 * Integer.parseInt(String.valueOf(a.charAt(i - 2)));
        ans.append(sum);
      }
    }
    ans.reverse();
    bw.write(String.valueOf(ans));
    bw.flush();
  }
}
