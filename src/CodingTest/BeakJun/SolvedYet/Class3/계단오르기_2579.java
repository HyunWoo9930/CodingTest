package CodingTest.BeakJun.SolvedYet.Class3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 계단오르기_2579 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int steps = sc.nextInt();
    List<Integer> list = new LinkedList<>();
    int[] arr = new int[steps + 2];
    for(int i = 0; i < steps; i++) {
      list.add(sc.nextInt());
    }
    arr[0] = list.get(0);
    arr[1] = list.get(0) + list.get(1);
    for(int i = 2; i < steps; i++) {
      arr[i] = Math.max(arr[i-1], arr[i-2]);
    }
    System.out.println(Arrays.toString(arr));

  }

}
