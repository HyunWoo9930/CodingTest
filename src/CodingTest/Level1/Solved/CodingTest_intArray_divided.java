package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodingTest_intArray_divided {

  public static void main(String[] args) {

    int[] arr = {3,2,6};
    int divisor = 10;
    List<Integer> answer = new ArrayList<>();
    for(int i = 0;i< arr.length;i++) {
      if(arr[i] % divisor == 0) {
        answer.add(arr[i]);
      }
    }
    Collections.sort(answer);
    if(answer.size() == 0) answer.add(-1);
    System.out.println(answer);
    int[] answer2 = answer.stream().mapToInt(Integer::intValue).toArray();



  }

}
