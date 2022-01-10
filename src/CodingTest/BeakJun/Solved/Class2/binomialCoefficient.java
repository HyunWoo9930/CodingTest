package CodingTest.BeakJun.Solved.Class2;

import java.util.Scanner;

public class binomialCoefficient {
  // 이항계수
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(factorial(a)/(factorial(b)*factorial(a-b)));
  }
  public static int factorial(int a) {
    int sum = 1;
    for(int i = 1;i<a+1;i++) {
      sum *= i;
    }
    return sum;
  }
}
