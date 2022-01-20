package CodingTest.Programmers.Level2.Helped;

import java.util.Arrays;

public class 땅따먹기 {

  public static void main(String[] args) {
    int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
//    int[][] land = {{1,1,1,1}, {2,2,2,3}, {3,3,3,6},{4,4,4,7}};
    int[] a = new int[land.length];
    int answer = 0;

    for(int i = 1;i<land.length;i++) {
      land[i][0] += max(land[i-1][1],land[i-1][2],land[i-1][3]);
      land[i][1] += max(land[i-1][0],land[i-1][2],land[i-1][3]);
      land[i][2] += max(land[i-1][0],land[i-1][1],land[i-1][3]);
      land[i][3] += max(land[i-1][1],land[i-1][2],land[i-1][0]);
    }

    answer = (max(land[land.length-1]));
  }
  public static int max(int a, int b, int c) {
    return Math.max(Math.max(a,b),c);
  }

  public static int max(int[] a) {
    Arrays.sort(a);
    return a[a.length-1];
  }


}
