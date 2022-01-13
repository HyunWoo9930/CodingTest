package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindDecimal {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] aArr = new int[a];
    for(int i = 0;i<a;i++) {
      aArr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 0;i<aArr.length;i++) {
      if(IsDecimal(aArr[i])) {
        count++;
      }
    }
    System.out.println(count);
  }
  public static boolean IsDecimal(int a) {
    if(a == 1) return false;
    for(int i = 1;i<1000;i++) {
      if(a % i == 0) {
        if(i != 1 && i != a) {
          return false;
        }
      }
    }
    return true;
  }

}
