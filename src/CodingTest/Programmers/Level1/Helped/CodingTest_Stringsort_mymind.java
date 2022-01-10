package CodingTest.Programmers.Level1.Helped;


import java.util.Arrays;
import java.util.Comparator;

public class CodingTest_Stringsort_mymind {
  public static void main(String[] ar) {
    String[] strings = {"abce", "abcd", "cdx"};
    int n = 1;
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.charAt(n) > o2.charAt(n))
          return 1;
        else if(o1.charAt(n) == o2.charAt(n)) {
          return o1.compareTo(o2);
        }
        else return -1;
      }
    });
  }
}
