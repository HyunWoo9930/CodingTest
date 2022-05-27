package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HideAndSeek {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int n = Integer.parseInt(str.split(" ")[0]);
    int k = Integer.parseInt(str.split(" ")[1]);

    for(int i = 0;;i++) {
      for(int j = 0;;j++) {
        for(int s = 0;;k++) {

          if(n == k) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("s = " + s);
          }

          Jump(n);
        }

      }
    }

  }
  public static int WalkForward(int a) {
    return a+1;
  }
  public static int WalkBackward(int a) {
    return a-1;
  }
  public static int Jump(int a) {
    return 2*a;
  }

}
