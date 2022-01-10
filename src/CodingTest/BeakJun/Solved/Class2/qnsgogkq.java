package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class qnsgogkq {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int answer = 0;
    for(int i = 0;i<=a;i++) {
      if (splits(i) == a) {
        answer = i;
        break;
      }
    }
    System.out.println(answer);
  }

  public static int splits(int a) {
    String[] arr = String.valueOf(a).split("");
    int sum = 0;
    for(int i = 0;i<arr.length;i++) {
      sum += Integer.parseInt(arr[i]);
    }
    sum += a;
    return sum;
  }
}