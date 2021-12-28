package CodingTest.Programmers.Level2.Helped;

import java.util.Arrays;
import java.util.Comparator;

public class LargeNum_2 {

  public static void main(String[] args) {
    int[] numbers = {6, 10, 2};
    String answer = "";
    String[] numbersStringArray = new String[numbers.length];
    for (int i = 0; i < numbersStringArray.length; i++) {
      numbersStringArray[i] = String.valueOf(numbers[i]);
//      System.out.println("numbersStringArray = " + numbersStringArray[i]);
    }
    Arrays.sort(numbersStringArray, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return (b + a).compareTo(a + b);
      }
    });

    if (numbersStringArray[0].equals("0")) {
      answer = "0";
    }
    for (String a : numbersStringArray) {
      answer += a;
    }
    System.out.println("answer = " + answer);


  }

}
