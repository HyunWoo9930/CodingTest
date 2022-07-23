package CodingTest.BeakJun.Solved.Class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coin0 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int answer = 0;
    for (int i = 0; i < N; i++) {
      int val = sc.nextInt();
      if (val < K) {
        list.add(val);
      } else if (val == K) {
        answer = 1;
      }
    }
    if (answer == 1) {
      System.out.println(answer);
    } else {
      // List : [1, 5, 10, 50, 100, 500, 1000]
      int listSize = list.size() - 1;
      while (K != 0) {
        answer += K / list.get(listSize);
        K %= list.get(listSize);
        listSize--;
      }
      System.out.println(answer);
    }
  }
}
