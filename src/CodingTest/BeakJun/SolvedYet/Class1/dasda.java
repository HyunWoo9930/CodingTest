package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class dasda {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int M = Integer.parseInt(str.split(" ")[0]);
    int N = Integer.parseInt(str.split(" ")[1]);

    for (int i = M; i <= N; i++) {
      if (IsDecimal(i)) {
        bw.write(i + "\n");
      }
    }
    bw.flush();
  }

  public static boolean IsDecimal(int a) {
    if (a == 1)
      return false;
    for (int i = 1; i < 1000; i++) {
      if (i > a) {
        return true;
      } else {
        if (a % i == 0) {
          if (i != 1 && i != a) {
            return false;
          }
        }
      }

    }
    return true;
  }
}