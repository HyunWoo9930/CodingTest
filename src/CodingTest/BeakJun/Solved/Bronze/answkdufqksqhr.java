package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class answkdufqksqhr {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    for(int i = 0;i<a;i++) {
      String str = br.readLine();
      int b = Integer.parseInt(str.split(" ")[0]);
      String c = str.split(" ")[1];
      String[] alphabet = c.split("");
      String answer = "";
      for(int j = 0;j< alphabet.length;j++) {
        for(int k = 0;k<b;k++) {
          answer += alphabet[j];
        }
      }
      System.out.println(answer);
    }
  }
}
