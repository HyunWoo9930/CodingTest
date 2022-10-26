package CodingTest;

import java.util.ArrayList;
import java.util.List;

public class Num4 {

  public static void main(String[] args) throws Exception {
    int i = 9;
    String ad = Integer.toBinaryString(i).replaceAll("0", "");
    int answer = 0;

    List<String> list = new ArrayList<>();
    for(int j = i-1; j > 0; j--) {
      list.add(Integer.toBinaryString(j).replaceAll("0", ""));
    }

    for(int j = i-1; j > 0; j--) {
      if(list.get(j-1).equals(ad)) {
        answer++;
      }
    }

    System.out.println(answer);
  }
}
