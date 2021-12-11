package CodingTest.Level1.Solved;

import java.util.stream.Stream;

public class CodingTest_reverseInt {

  public static void main(String[] args) {
    long n = 12345;
    long temp = n;
    long[] nArr = new long[(int) Math.log10(n) + 1];
    int i = 0;
    System.out.println((int) Math.log10(n));
    while (n > 10) {
      long nn = n % 10;
      nArr[i] = nn;
      System.out.println(nArr[i]);
      i++;
      n /= 10;
    }
    nArr[(int) Math.log10(temp)] = n;




  }
}
