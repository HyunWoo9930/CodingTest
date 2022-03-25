package CodingTest.BeakJun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInside {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n.length(); i++) {
      list.add(Integer.parseInt(n.split("")[i]));
    }
    Collections.sort(list);
    for(int i = list.size()-1 ; i >= 0;i--) {
      System.out.print(list.get(i));
    }
  }
}
