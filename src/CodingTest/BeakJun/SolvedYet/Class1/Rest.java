package CodingTest.BeakJun.SolvedYet.Class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> b = new ArrayList<>();
    for(int i = 0;i<10;i++) {
      int a = sc.nextInt();
      b.add(a% 42);
    }
    List<Integer> c = b.stream().distinct().collect(Collectors.toList());
    System.out.println(c.size());
  }
}
