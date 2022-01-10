package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int result = 0;
    int count = 0;
    if (a < 100) {
      System.out.println(a);
    } else if (a == 1000) {
      System.out.println(144);
    }
      else {
      count += 99;
      for (int i = 100; i <= a; i++) {
        String[] arr = String.valueOf(i).split("");
        if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == (Integer.parseInt(arr[1]) * 2)){
          count++;
        }

      }
      System.out.println(count);
    }
  }
}
