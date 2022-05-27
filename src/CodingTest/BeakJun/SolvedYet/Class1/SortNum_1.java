package CodingTest.BeakJun.SolvedYet.Class1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNum_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    List<Integer> x = new ArrayList<>();
    List<Integer> y = new ArrayList<>();

    for(int i = 0;i<a;i++) {
      x.add(sc.nextInt());
      y.add(sc.nextInt());
    }
    Collections.sort(x);
    Collections.sort(y);
    for(int i = 0;i<a;i++) {
      System.out.println(x.get(i) + " " + y.get(i));
    }
  }
}