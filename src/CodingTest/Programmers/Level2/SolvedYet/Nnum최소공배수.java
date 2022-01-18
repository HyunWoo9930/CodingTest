package CodingTest.Programmers.Level2.SolvedYet;

import java.util.Arrays;

public class Nnum최소공배수 {

  public static void main(String[] args) {
//    int[] arr = {2, 6, 8, 14};
    int[] arr = {3,4,9,16};
//    int[] arr = {1,2,3};
    Arrays.sort(arr);

    for(int i = 1;i<= arr[0];i++) {
      for(int j = 0;j<arr.length;j++) {
        if(arr[j] % i != 0) {
          break;
        }
        System.out.println(i);
      }

    }

  }

}
