package CodingTest.BeakJun.SolvedYet.Class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejdcl {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] bodysize = new int[sc.nextInt()][2];
    for(int i = 0;i<bodysize.length;i++) {
      bodysize[i][0] = sc.nextInt();
      bodysize[i][1] = sc.nextInt();
    }

    for(int i = 0;i<bodysize.length;i++) {
      System.out.println(bodysize[i][0]);
      System.out.println(bodysize[i][1]);
    }

  }

}
