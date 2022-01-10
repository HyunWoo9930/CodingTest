package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMHotel {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int i= 0;i<T;i++) {
      String str = br.readLine();
      int H = Integer.parseInt(str.split(" ")[0]);
      int W = Integer.parseInt(str.split(" ")[1]);
      int n = Integer.parseInt(str.split(" ")[2]);

      int a = n/H; // 9
      int b = n%H; // 1

      if(b != 0) {
        if(a < 9) {
          System.out.println(b + "0" + (a+1));
        } else {
          System.out.println(String.valueOf(b) + (a+1));
        }
      } else {
        if(a <= 9) {
          System.out.println(H + "0" + a);
        } else {
          System.out.println(String.valueOf(H) + a);
        }
      }
    }
  }
}
