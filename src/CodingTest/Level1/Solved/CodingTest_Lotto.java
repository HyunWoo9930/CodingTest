package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_Lotto {

  public static void main(String[] ar) {
    int[] lotto = {45, 4, 35, 20, 3, 9};
    int[] win_num = {20, 9, 3, 45, 4, 35};
    List<Integer> lottos = Arrays.stream(lotto).boxed().collect(Collectors.toList());
    List<Integer> win_nums = Arrays.stream(win_num).boxed().collect(Collectors.toList());
    int[] result = new int[2];

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
    System.out.println(lottos);
    System.out.println(count);
    for(int i = 0; i< lottos.size();i++) {
      if(lottos.get(i) == 0) {
        imagine++;
      }
    }
    System.out.println(imagine);
    int MaxCount = imagine + count;
    int MinCount = count;

    s(MaxCount,0,result);
    s(MinCount,1,result);

    System.out.println(result[0] +" : "+ result[1]);


  }
  public static void s(int result_count,int n, int[] results) {
    if(result_count == 6) results[n] = 1;
    else if(result_count == 5)  results[n] = 2;
    else if(result_count == 4)  results[n] = 3;
    else if(result_count == 3)  results[n] = 4;
    else if(result_count == 2)  results[n] = 5;
    else  results[n] = 6;
  }


}
