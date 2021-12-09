package CodingTest.Level1.Solved;

import java.util.Arrays;

public class CodingTest_double_sort {
  public static void main(String[] ar) {
    long n = 118372;
    String N = Long.toString(n);
    String[] Ns = N.split("");
    Arrays.sort(Ns);
    N = "";
    for(int i = Ns.length-1;i>=0;i--) {
      N += Ns[i];
    }
    long answer = Long.parseLong(N);
    System.out.println(answer);
  }

}
