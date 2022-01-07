package CodingTest.BeakJun.SolvedYet.Class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class phalindrom {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> a = new ArrayList<>();
    while (true) {
      int b = sc.nextInt();
      if(b == 0) {
        break;
      }
      else {
        System.out.println(b);
      }
    }
  }

}
