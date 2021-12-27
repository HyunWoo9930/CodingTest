package CodingTest.Programmers.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_ExceptNums {
  public static void main(String[] ar){
    // input [1,2,3,4,6,7,8]                14
    // input [5,8,4,0,6,7,9]                6
    int[] numbers = {1,2,3,4,6,7,8};
    int[] all_nums = {1,2,3,4,5,6,7,8,9};
    List<Integer> number = Arrays.stream(numbers).boxed().collect(Collectors.toList());
    List<Integer> all_num = Arrays.stream(all_nums).boxed().collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();
    for(int i = 0; i< number.size();i++) {
      for(int j = 0;j< all_num.size();j++) {
        if (number.get(i) == all_num.get(j)) {
          all_num.remove(j);
        }
      }
    }
    int sum = 0;
    for(int i = 0;i<all_num.size();i++) {
      sum += all_num.get(i);
    }
System.out.println(sum);
  }

}
