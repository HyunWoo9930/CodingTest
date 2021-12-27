package CodingTest.Programmers.Level2.SolvedYet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetGround {

  public static void main(String[] args) {
    int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
    int[] a = new int[land.length];
    List<Integer> results = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < a.length; i++) {
      a[i] = r.nextInt(4) + 1;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          i--;
        }
      }
    }
    for (int value : a) {
      results.add(value);
    }
    int result = 0;
    List<Integer> resultss = new ArrayList<>();
    for(int i = 0;i<land.length;i++) {
      result += land[i][results.get(i)];
      resultss.add(result);
    }
    System.out.println(resultss);



  }

}
