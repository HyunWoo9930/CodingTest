package CodingTest.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CodingTest_decimal {

  public static void main(String[] ar) {
    int[] nums = {1, 2, 3, 4}; // 2+1 + 1
    int[] nums2 = {1, 2, 7, 6, 4}; // 3+2+1 +2+1 + 1
    Set<Integer> list = new HashSet<Integer>();
    int hab = 0;

    for (int i = 0; i < nums.length; i++) {
      int item = nums[i];
      for (int j = 0; j < nums.length; j++) {
        int item2 = nums[j];
        for (int k = 0; k < nums.length; k++) {
          int item3 = nums[k];
          if (i != j && i != k && j != k) {
            hab = item + item2 + item3;
            list.add(hab);
          }
        }
      }
    }
    List<Integer> list1 = new ArrayList(list);
    List<Integer> list2 = new ArrayList(list);
    Collections.sort(list1);
    System.out.println(list1);
    int count = 0;
    for (int i = 0; i < list1.size(); i++) {
      if (make_prime(list1.get(i)) != 0) {
        System.out.println(make_prime(list1.get(i)));
        count++;
      }
    }
    System.out.println(count);
  }
  public static int make_prime(int number) {

    for(int i = 2; i < number; i++) {
      if(number % i == 0) {
        return 0;
      }
    }

    return number;
  }
}
