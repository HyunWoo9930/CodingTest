package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class num2 {

  public static void main(String[] args) throws Exception {
    String[] movies = new String[] {"spy", "ray", "spy", "room", "once", "ray", "spy", "once"};
    List<String> movie = new ArrayList<>(Arrays.asList(movies));
    Map<String, Integer> count = new HashMap<>();
    int moviecount = movie.size();
    for(Object movieName : movie) {
      int i = 0;
      for(String m : movies) {
        if(movieName.toString().equals(m)) {
          i++;
        }
      }
      count.put(movieName.toString(), i);
    }
    List<Entry<String, Integer>> entryList = new LinkedList<>(count.entrySet());
    entryList.sort(Map.Entry.comparingByValue());
    String[] ans = new String[moviecount];
    for(Map.Entry<String, Integer> entry : entryList) {
      for (int i = ans.length - 1; i >= 0; i--) {
        ans[i] = entry.getKey();
      }
    }
    System.out.println(Arrays.toString(ans));
  }

}
