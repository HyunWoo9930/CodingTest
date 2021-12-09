package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_findDecimal {

  public static void main(String[] ar) {
    int n = 10;
    List<Integer> answers = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          answers.add(i);
        }
      }
    }
    answers = answers.stream().distinct().collect(Collectors.toList());
    int answer = n - (answers.size() + 1);
  }
}
