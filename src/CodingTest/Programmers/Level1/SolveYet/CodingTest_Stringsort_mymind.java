package CodingTest.Programmers.Level1.SolveYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingTest_Stringsort_mymind {
  public static void main(String[] ar) {
    String[] strings = {"sun", "bed", "car"};
    int n = 1;
    String[] strings2_2 = new String[strings.length];
    Map<String,String> map = new HashMap<>();
    for(int i = 0;i<strings.length;i++) {
      strings2_2[i] = strings[i].substring(n)+strings[i].substring(0,n);
      System.out.println(strings2_2[i]);
      map.put(strings2_2[i],strings[i]);
    }
    Object[] mapKey = map.keySet().toArray();
    Arrays.sort(mapKey);
    for(String keyVal : map.keySet()) {
      System.out.println(map.get(keyVal));
    }
  }
}
