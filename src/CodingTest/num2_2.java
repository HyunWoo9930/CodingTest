package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class num2_2 {

  public static void main(String[] args) throws Exception {
    String[] movie = new String[]{"spy", "ay", "spy", "room", "once", "ay", "spy", "once"};
    HashSet<String> hashSet = new HashSet<>(Arrays.asList(movie));
    String[] string = hashSet.toArray(new String[0]);
    String[] ans = new String[string.length];

    Map<String, Integer> movieMap = new HashMap<>();


    for (String str : string) {
      movieMap.put(str, count(str, movie));
    }

    List<String> keySet = new ArrayList<>(movieMap.keySet());
    keySet.sort((o1, o2) -> {
      if(movieMap.get(o1) <= movieMap.get(o2)) {
        if (o1.charAt(0) < o2.charAt(0)) {
          return 1;
        }
      } else {
        return movieMap.get(o2).compareTo(movieMap.get(o1));
      }
      return 0;
    });

    for (int i = 0; i < keySet.size(); i++) {
      ans[i] = keySet.get(i);
    }
    System.out.println(Arrays.toString(ans));
  }

  static int count(String str, String[] strings) {
    int count = 0;
    for (String string : strings) {
      if (string.equals(str)) {
        count++;
      }
    }
    return count;
  }
}
