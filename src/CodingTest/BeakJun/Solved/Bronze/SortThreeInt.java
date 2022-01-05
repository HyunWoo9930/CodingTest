package CodingTest.BeakJun.Solved.Bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortThreeInt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> sort = new ArrayList<>();
    sort.add(sc.nextInt());
    sort.add(sc.nextInt());
    sort.add(sc.nextInt());
    Collections.sort(sort);
    System.out.print(sort.get(0));
    System.out.print(" ");
    System.out.print(sort.get(1));
    System.out.print(" ");
    System.out.print(sort.get(2));
  }

}
