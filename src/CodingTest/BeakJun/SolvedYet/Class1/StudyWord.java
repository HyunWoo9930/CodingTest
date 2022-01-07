package CodingTest.BeakJun.SolvedYet.Class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudyWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    a = a.toLowerCase();
    List<String> c = Arrays.stream(a.split("")).distinct().collect(Collectors.toList());
    System.out.println(c);
    Map map = new HashMap();
    int max = 0;
    for(int i = 0;i<c.size();i++) {
      map.put(c.get(i),(countChar(a,c.get(i))));
    }
    List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
    entryList.sort(Entry.comparingByValue());
    System.out.println(entryList);
  }



  public static int countChar(String str, String ch) {
    return str.length() - str.replace((ch), "").length();
  }

}
