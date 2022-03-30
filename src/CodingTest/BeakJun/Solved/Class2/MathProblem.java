package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathProblem {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      Pattern pattern = Pattern.compile("\\d+");
      Matcher matcher = pattern.matcher(str);
      while(matcher.find()) {
        list.add(Long.parseUnsignedLong(matcher.group(0)));
      }
    }
    Collections.sort(list);
    for(long i : list) {
      System.out.println(i);
    }
  }
}
