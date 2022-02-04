package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치함수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int[] fibonachi = new int[41];

    for (int i = 0; i < 41; i++) {
      fibonachi[i] = fibo(i);
    }

    for (int i = 0; i < N; i++) {
      int a = Integer.parseInt(br.readLine());
      if (a == 0) {
        bw.write(1 + " " + 0 + "\n");
      } else {
        bw.write(fibonachi[a - 1] + " " + fibonachi[a] + "\n");
      }
    }
    bw.flush();
  }

  public static int fibo(int a) {
    if (a == 0) {
      return 0;
    }
    if (a == 1) {
      return 1;
    } else {
      return fibo(a - 1) + fibo(a - 2);
    }
  }
}
