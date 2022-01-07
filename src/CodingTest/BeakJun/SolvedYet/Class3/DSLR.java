package CodingTest.BeakJun.SolvedYet.Class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSLR {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    List<Integer> A = new ArrayList<>();
    List<Integer> B = new ArrayList<>();
    for(int i = 0;i<a;i++) {
      A.add(sc.nextInt());
      B.add(sc.nextInt());
    }

  }

  public static void find(int a,int b) {



  }

  public static int D(int a) {
    return (a *2 > 10000)? (a*2)%10000 : a * 2;
  }

  public static int S(int a) {
    return (a != 0)? a-1:9999;
  }

  public static int L(int a) {
    int b = a / 1000;
    int c = (a - (b*1000)) / 100;
    int d = (a - (b*1000) - (c*100)) / 10;
    int e = a % 10;
    return c * 1000 + d * 100 + e * 10 + b;
  }

  public static int R(int a) {
    int b = a / 1000;
    int c = (a - (b*1000)) / 100;
    int d = (a - (b*1000) - (c*100)) / 10;
    int e = a % 10;
    return e * 1000 + b * 100 + c * 10 + d;
  }
}
