package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer> numList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      numList.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(numList);
    for(int a : numList) {
      System.out.println(a);
    }
  }
}
