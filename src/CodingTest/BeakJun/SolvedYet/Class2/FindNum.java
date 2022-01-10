package CodingTest.BeakJun.SolvedYet.Class2;

import java.util.Scanner;

public class FindNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] aArr = new int[a];
    for(int i = 0;i<a;i++) {
      aArr[i] = sc.nextInt();
    }
    int b = sc.nextInt();
    int[] bArr = new int[b];
    for(int i = 0;i<b;i++) {
      bArr[i] = sc.nextInt();
    }

    for(int i =0;i<bArr.length;i++) {
      boolean contain = false;
      for(int j = 0;j<aArr.length;j++) {
        if (aArr[j] == bArr[i]) {
          contain = true;
          break;
        }
      }
      if (contain) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}
