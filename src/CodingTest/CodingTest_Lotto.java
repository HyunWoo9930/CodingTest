package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Lotto {

  public static void main(String[] ar) {
    List<Integer> lottos = new ArrayList<Integer>(Arrays.asList(44, 1, 0, 0, 31, 25));
    List<Integer> win_nums = new ArrayList<Integer>(Arrays.asList(31, 10, 45, 1, 6, 19));
    List<Integer> result = new ArrayList<>();

    int count = 0;
    int imagine = 0;

    for(int i = 0; i< lottos.size();i++) {
      for(int j = 0; j < win_nums.size();j++) {
        if(lottos.get(i) == win_nums.get(j)) {
          lottos.remove(i);
          count++;
        }
      }
    }

    for(int i = 0; i< lottos.size();i++) {
      if(lottos.get(i) == 0) {
        imagine++;
      }
    }
    int MaxCount = imagine + count;
    int MinCount = count;

    s(MaxCount,result);
    s(MinCount,result);

    System.out.println(result);


  }
  public static void s(int result_count, List<Integer> results) {
    if(result_count == 6) results.add(1);
    else if(result_count == 5) results.add(2);
    else if(result_count == 4) results.add(3);
    else if(result_count == 3) results.add(4);
    else if(result_count == 2) results.add(5);
    else results.add(6);
  }


}
