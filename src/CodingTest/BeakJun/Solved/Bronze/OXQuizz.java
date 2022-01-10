package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OXQuizz {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());

    for (int i = 0; i < a; i++) {
      int result = 0;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("O+");
      Matcher matcher = pattern.matcher(str);

      while (matcher.find()) {
        result += fac(matcher.group().length());
      }
      System.out.println(result);
    }
  }

  public static int fac(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum += i;
    }
    return sum;
  }
}