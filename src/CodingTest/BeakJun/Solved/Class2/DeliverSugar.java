package CodingTest.BeakJun.Solved.Class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeliverSugar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a / 3;
    int c = a / 5;

    List<Integer> answer = new ArrayList<>();
    for(int i = 0;i<=b;i++) {
      for(int j = 0;j<=c;j++) {
        if ((i * 3 + j * 5) == a) {
          answer.add(i+j);
        }
      }
    }
    Collections.sort(answer);
    if (!answer.isEmpty()) {
      System.out.println(answer.get(0));
    } else {
      System.out.println(-1);
    }
  }
}