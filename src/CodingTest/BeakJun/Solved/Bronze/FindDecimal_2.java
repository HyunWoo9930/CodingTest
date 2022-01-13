package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDecimal_2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      int a = Integer.parseInt(br.readLine());
      int count = 0;
      if(a == 0) break;
      else {
        for(int i = a+1;i<=2*a;i++) {
          if(IsDecimal(i)) {
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }
  public static boolean IsDecimal(int a) {
    if(a == 1) return false;
    for(int i = 1;i<1000;i++) {
      if(a % i == 0) {
        if(i != 1 && i != a) {
          return false;
        }
      }
    }
    return true;
  }
}
