package CodingTest.Programmers.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_hate_sameNum {

  public static void main(String[] args) {
    int[] arr = {1,1,3,3,0,1,1};
    List<Integer> jArr = new ArrayList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          jArr.add(j);
          break;
        }
        else break;
      }
    }
    List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
    for(int i = jArr.size()-1;i >= 0;i--) {
      int remove = jArr.get(i);
      arrList.remove(remove);
    }
    int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();

  }

}
