package CodingTest.BeakJun.SolvedYet;

import java.util.Scanner;

public class TimeCard {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();

    Cal(a);
    Cal(b);
    Cal(c);
  }

  public static void Cal(String a) {
    String[] Array = a.split(" ");
    int i = Integer.parseInt(Array[3]) - Integer.parseInt(Array[0]);
    int j = Integer.parseInt(Array[4]) - Integer.parseInt(Array[1]);
    int k = Integer.parseInt(Array[5]) - Integer.parseInt(Array[2]);
    if (k < 0) {
      j -= 1;
      k += 60;
      if (j < 0) {
        i -= 1;
        j += 60;
        if (i < 0) {
          i += 24;
        }
      }

    }
    System.out.println(i + " " + j + " " + k);
  }
}
