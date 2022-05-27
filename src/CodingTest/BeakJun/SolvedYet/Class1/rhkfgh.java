package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class rhkfgh {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    for(int i = 0;i<a;i++) {
      Isrhkfgh(br.readLine());
    }
  }

  public static void Isrhkfgh(String str) {
    str = str.replaceAll("\\(?\\(\\)\\)?","");
    if (!str.isBlank()) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
