package CodingTest.BeakJun.Solved.Class3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ATM_11399 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < N; i++) {
      map.put(i + 1, sc.nextInt());
    }
    // Map value 값으로 정렬 !!
    List<Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
    entryList.sort(Map.Entry.comparingByValue());
    int sum = 0;
    int answer = 0;
    for(Map.Entry<Integer, Integer> entry : entryList) {
      sum += entry.getValue();
      answer += sum;
    }
    System.out.println(answer);
  }
}
