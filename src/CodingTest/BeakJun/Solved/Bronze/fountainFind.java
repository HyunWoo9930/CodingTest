package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fountainFind {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    int step = 0;
    int i = 1;
    while(true) {
      if(a > step && a <= step+ i) {
        break;
      }
      step += i;
      i++;
    }

    if(i % 2 == 0) {
      System.out.println((a - step) + "/" + ((i+1)-(a-step)));
    } else {
      System.out.println((((i+1)-(a-step)) + "/" + (a-step)));
    }
  }
}
