package CodingTest.BeakJun.Solved.Bronze;

import java.util.Objects;
import java.util.Scanner;

public class Dial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String[] aArr = a.split("");

    int result = 0;

    for(int i = 0;i<aArr.length;i++) {
      result += count(aArr[i]);
    }
    System.out.println(result);
  }


  public static int count(String a) {
    if (Objects.equals(a, "A") || Objects.equals(a, "B") || Objects.equals(a, "C")) {
      return 3;
    }
    else if (Objects.equals(a, "D") || Objects.equals(a, "E") || Objects.equals(a, "F")) {
      return 4;
    }
    else if (Objects.equals(a, "G") || Objects.equals(a, "H") || Objects.equals(a, "I")) {
      return 5;
    }
    else if (Objects.equals(a, "J") || Objects.equals(a, "K") || Objects.equals(a, "L")) {
      return 6;
    }
    else if (Objects.equals(a, "M") || Objects.equals(a, "N") || Objects.equals(a, "O")) {
      return 7;
    }
    else if (Objects.equals(a, "P") || Objects.equals(a, "Q") || Objects.equals(a, "R") || Objects.equals(
        a, "S")) {
      return 8;
    }
    else if (Objects.equals(a, "T") || Objects.equals(a, "U") || Objects.equals(a, "V")) {
      return 9;
    }
    else if (Objects.equals(a, "W") || Objects.equals(a, "X") || Objects.equals(a, "Y") || Objects.equals(
        a, "Z")) {
      return 10;
    }
    return 0;
  }





}

