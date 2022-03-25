package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class statistics {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());
      arr[i] = num;
      sum += num;
    }
    // 산술 평균
    System.out.println(Math.round(sum / (float)n));
    // 중앙값
    Arrays.sort(arr);
    System.out.println(arr[n / 2]);
    // 최빈값
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, 0);
    }
    int max = 1;
    for (int i : arr) {
      if (map.get(i) == 0) {
        map.put(i, 1);
      } else {
        int count = 0;
        count = map.get(i);
        map.put(i, ++count);
      }
    }
    // 최빈값이 몇인지 찾기
    for (int i : map.values()) {
      if (max < i) {
        max = i;
      }
    }

    // map 정렬
    Stream<Entry<Integer, Integer>> sorted =
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue());
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (max == map.get(arr[i])) {
        if (!list.contains(arr[i])) {
          list.add(arr[i]);
        }
      }
    }
    Collections.sort(list);

    if (list.size() == 1) {
      System.out.println(list.get(0));
    } else {
      System.out.println(list.get(1));
    }

    // 범위
    if (n == 1) {
      System.out.println(0);
    } else {
      System.out.println(arr[n - 1] - arr[0]);
    }
  }
}
