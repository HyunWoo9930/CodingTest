package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHome {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long a = Long.parseLong(br.readLine());
    long last = 0;
    if (a == 1) {
      System.out.println(1);
    } else {
      for (long i = 1; ; i++) {
        if (a <= (i * 6 + last + 1) && a > last + 1) {
          System.out.println(i + 1);
          break;
        }
        last = (i * 6 + last);
      }
    }
  }
}
