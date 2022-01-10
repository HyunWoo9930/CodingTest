package CodingTest.BeakJun.Solved.Bronze;

import java.util.Scanner;

public class VacationHomeWork {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    int i = c / e;
    if(c % e != 0) i++;
    int j = b / d;
    if(b % d != 0) j++;
    a -= Math.max(i,j);
    System.out.println(a);



  }

}
