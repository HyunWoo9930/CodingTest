package CodingTest.BeakJun.SolvedYet.Class2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Age {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Map<String,Integer> map = new HashMap<>();
    for(int i = 0;i<a;i++) {
      int b = sc.nextInt();
      String c = sc.next();
      map.put(c,b);
    }
    System.out.println(map.values());


  }
}
