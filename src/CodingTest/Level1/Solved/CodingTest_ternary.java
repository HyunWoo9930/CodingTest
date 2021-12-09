package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.List;

public class CodingTest_ternary {
  public static void main(String[] ar) {
    int n = 125;
    int rest = 0;

    List<Integer> numList = new ArrayList<>();
    while(n / 3 != 0) {
      rest = n % 3;
      n /= 3;
      numList.add(rest);
    }
    int answer = 0;
    numList.add(n);
    System.out.println(numList);
    for(int i = 0;i<numList.size();i++) {
      answer += numList.get(i) * Math.pow(3 ,(numList.size()-(i+1)));
      System.out.println(numList.get(i) * 3 ^ (numList.size()-(i+1)));
    }
    System.out.println(answer);

  }

}
