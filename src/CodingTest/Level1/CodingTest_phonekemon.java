package CodingTest.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_phonekemon {

  public static void main(String[] ar) {
    int[] nums = {3, 1, 2, 3};
    int getPhonekemons = nums.length / 2;
    int answer = 0;
    List<Integer> monList = Arrays.stream(nums).boxed().collect(Collectors.toList());
    monList = monList.stream().distinct().collect(Collectors.toList());
    System.out.println(monList);
    if (monList.size() >= getPhonekemons) {
      answer = getPhonekemons;
    } else {
      answer = monList.size();
    }


  }
}
