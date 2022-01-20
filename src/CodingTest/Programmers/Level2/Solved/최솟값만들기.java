package CodingTest.Programmers.Level2.Solved;

import java.util.Arrays;

public class 최솟값만들기 {

  public static void main(String[] args) {
    int[] a = {1, 4, 2}, b = {5, 4, 4};
    int result = 0;
    Arrays.sort(a);
    Arrays.sort(b);

    for(int i = 0;i<a.length;i++) {
      result += a[i] * b[b.length-(i+1)];
    }
    System.out.println(result);
  }
}
