package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 골드바흐의추측 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] prime = new int[1000000];
    int pn = 0;
    boolean[] check = new boolean[1000000];
    int n = 999999;
    for(int i = 2; i <= n;i++) {
      if(!check[i]) {
        prime[pn++] = i;
        for(int j = i*2; j <= n; j+=i) {
          check[j] = true;
        }
      }
    }

    while(true) {
      String answer = "";
      int a = Integer.parseInt(br.readLine());
      if(a == 0) break;
      for (int i = 2; i < check.length; i++) {
        if (!check[i]) {
          if (!check[a-i]) {
            answer += i + " + ";
            answer += (a-i);
            break;
          }
        }
      }
      if(answer.isEmpty()) {
        bw.write("Goldbach's conjecture is wrong.");
      } else {
        bw.write(a + " = " + answer);
        bw.write("\n");
      }
    }
    bw.flush();
  }
}
