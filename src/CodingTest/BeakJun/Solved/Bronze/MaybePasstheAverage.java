package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaybePasstheAverage {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i =0;i<a;i++) {
      double sum = 0;
      int b = sc.nextInt();
      int[] arr = new int[b];
      for(int j = 0;j<b;j++) {
        arr[j] = sc.nextInt();
        sum += arr[j];
      }
      int count = 0;
      double average = sum / b;
      for(int j = 0;j<arr.length;j++) {
        if(arr[j] > average) count++;
      }
      double percentage = ((float)count / b) * 100;
      String result2 = String.format("%.3f",percentage);
      System.out.println(result2);
    }
  }
}
