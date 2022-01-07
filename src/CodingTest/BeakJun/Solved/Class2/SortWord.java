package CodingTest.BeakJun.Solved.Class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String[] str = new String[a];

    for(int i = 0;i<a;i++) {
      str[i] = sc.next();
    }
    Arrays.sort(str, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.length() > o2.length())
          return 1;
        else if(o1.length() == o2.length())
          return o1.compareTo(o2);
        else return -1;
      }
    });
    List<String> strList = Arrays.stream(str).distinct().collect(Collectors.toList());
    for(int i = 0;i<strList.size();i++) {
      System.out.println(strList.get(i));
    }
  }
}