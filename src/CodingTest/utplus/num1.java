package CodingTest.utplus;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class num1 {

  public static void main(String[] args) throws Exception {
//    int[] arr = {2,1,3,3};
//    int[] arr = {3,4,4,2,5,2,5,5};
    int[] arr = {3,5,3,5,7,5,7};

    List<Integer> list = new LinkedList<>();
    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1;j < arr.length; j++) {
        if(arr[i] == arr[j]) {
          if(!list.contains(arr[i]))
          list.add(arr[i]);
        }
      }
    }
    List<Integer> answer1 = new LinkedList<>();
    for(int j : arr) {
      if(!list.contains(j)) {
        answer1.add(j);
      }
    }
    if(answer1.size() > 0) {
      Collections.sort(answer1);
      int[] answer = answer1.stream().mapToInt(Integer::intValue).toArray();
      System.out.println(Arrays.toString(answer));
    } else {
      answer1.add(-1);
      int[] answer = answer1.stream().mapToInt(Integer::intValue).toArray();
      System.out.println(Arrays.toString(answer));
    }
  }
}
