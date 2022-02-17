package CodingTest.Programmers.Level2.SolvedYet;

import java.util.Arrays;

public class Skoville {

  public static void main(String[] args) {
    int[] scovilles = {1, 2, 3, 9, 10, 12};
    int k = 7;

    int scoville = 0;
    Arrays.sort(scovilles);
    int a = scovilles[0];
    for(int i = 0;i<scovilles.length-1;i++) {
      if(a >= k) {
        break;
      }
      int b = scovilles[i+1];
      a = a + (b*2);
      scoville++;
    }
    if(a < k) {
      scoville = -1;
    }

    System.out.println("scoville = " + scoville);
  }
}
