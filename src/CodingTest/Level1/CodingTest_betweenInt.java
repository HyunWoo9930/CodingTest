package CodingTest.Level1;

import java.util.ArrayList;
import java.util.List;

public class CodingTest_betweenInt {
  public static void main(String[] ar) {
    // input        a            b            // output
    //              3            5               12
    //              3            3               3
    //              5            3               12

    int a = 5;
    int b = 3;
    List<Integer> nums = new ArrayList<>();
    if(a < b) {
      for (int i = a; i <= b; i++) {
        nums.add(i);
      }

    }
    else if(a == b) {
      nums.add(a);
    }
    else {
      for (int i = b; i <= a; i++) {
        nums.add(i);
      }
    }
    int sum = 0;
    for(int i = 0;i< nums.size();i++) {
      sum += nums.get(i);
    }
    System.out.println(sum);
  }

}
