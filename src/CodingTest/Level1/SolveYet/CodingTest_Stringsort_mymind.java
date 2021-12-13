package CodingTest.Level1.SolveYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Stringsort_mymind {
  public static void main(String[] ar) {
    String[] strings = {"ae","ae","be","ce"};
    int n = 1;
    String[] strings2_2 = new String[strings.length];
    String[] answer = new String[strings.length];
    String[] strings2_1 = new String[strings.length];

    for(int i = 0;i<strings.length;i++) {
      strings2_1[i] = strings[i].substring(0,n);
      strings2_2[i] = strings[i].substring(n);
    }
    Arrays.sort(strings2_2);
    for(int i = 0;i<strings.length;i++) {
      strings2_2[i] += strings2_1[i];
      answer[i] = strings2_2[i].substring(strings[i].length()-n) + strings2_2[i].substring(0,strings[i].length()-n);
      System.out.println(answer[i]);
    }
  }
}
