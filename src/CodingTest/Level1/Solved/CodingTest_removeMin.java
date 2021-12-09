package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_removeMin {
  public static void main(String[] ar ){

    int[] arr = {4,3,2,1};
    int[] answer = new int[arr.length-1];
    List<Integer> answers = Arrays.stream(arr).boxed().collect(Collectors.toList());
    if(arr.length == 1) {
      answer[0] = -1;

    }
      else {
      Arrays.sort(arr);
      answers.remove(Integer.valueOf(arr[0]));
    }






  }

}
