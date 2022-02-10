package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class GoldbahsPartition {

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      System.out.println(sc.nextInt());
    }




  }

  public static boolean IsDecimal(int a) {
    if (a == 1) {
      return false;
    }
    for (int i = 1; i < 500; i++) {
      if (a % i == 0) {
        if (i != 1 && i != a) {
          return false;
        }
      }
    }
    return true;
  }

}
