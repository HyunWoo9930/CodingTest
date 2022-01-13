package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class GoldBahhsTheory {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      List<Integer> nDecimalList = new ArrayList<>();
      for(int j = 1;j<=n/2;j++) {
        if(IsDecimal(j)) {
          if(IsDecimal(n-j)) {
            nDecimalList.add(j);
          }
        }
      }
      bw.write(nDecimalList.get(nDecimalList.size()-1) + " " + (n - nDecimalList.get(nDecimalList.size()-1)) + "\n");
    }
    bw.flush();
  }

  public static boolean IsDecimal(int a) {
    if (a == 1) {
      return false;
    }
    for (int i = 1; i < 500; i++) {
      if (a % i == 0) {
        if (i != 1 && i != a) {
          return false;
        }
      }
    }
    return true;
  }

}
