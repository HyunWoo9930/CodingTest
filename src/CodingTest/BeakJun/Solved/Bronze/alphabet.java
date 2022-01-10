package CodingTest.BeakJun.Solved.Bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alphabet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    String[] b = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      for(int j = 0;j<b.length;j++) {
        if (a.contains(b[j]))
          System.out.print(a.indexOf(b[j]));
        else
          System.out.print("-1");
        System.out.print(" ");
      }
  }
}