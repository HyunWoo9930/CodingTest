package CodingTest.Programmers.Level2.SolvedYet;

import java.util.Arrays;

public class Nmin {

  public static void main(String[] args) {
    int[] arr = {2,6,8,14};
    Arrays.sort(arr);
    int a = 0;
    for (int i = 1; i <= arr[0]; i++) {
      for (int j : arr) {
        if (j % i != 0) {
          a = 1;
          break;
        }
        a = i;
      }
    }
    int answer = 1;
    for(int i = 0;i<arr.length;i++) {
      arr[i] /= a;
      answer *= arr[i];
    }
    answer *= a;
    System.out.println("answer = " + answer);
  }

}
