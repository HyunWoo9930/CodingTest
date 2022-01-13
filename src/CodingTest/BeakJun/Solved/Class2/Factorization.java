package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int i = 2;
    while(n > 1) {
      if (n % i == 0) {
        n /= i;
        System.out.println(i);
        i = 2;
      } else {
        i++;
      }
    }
  }
}
