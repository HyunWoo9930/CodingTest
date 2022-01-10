package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SnailWantsToGoUp {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int d = 0;
    int count = 0;
    int e = c / (a-b);
    int i = 0;
    while(i <= e) {
      count++;
      d += a;
      if(d >= c) {
        break;
      }
      d -= b;
      i++;
    }
    System.out.println(count);
  }
}