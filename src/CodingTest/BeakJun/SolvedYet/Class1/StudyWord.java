package CodingTest.BeakJun.SolvedYet.Class1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudyWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    a = a.toLowerCase();
    List<String> c = Arrays.stream(a.split("")).distinct().collect(Collectors.toList());
    int max = 0;
    int[] numArr = new int[c.size()];
    for(int i = 0;i<c.size();i++) {
      numArr[i] = countChar(a,c.get(i));
      max = Math.max(max,numArr[i]);
    }
    for(int i = 0;i<c.size();i++) {

    }

  }

  public static int countChar(String str, String ch) {
    return str.length() - str.replace((ch), "").length();
  }

}
