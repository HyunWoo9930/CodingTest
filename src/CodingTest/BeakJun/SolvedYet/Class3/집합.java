package CodingTest.BeakJun.SolvedYet.Class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 집합 {

  static StringBuilder str = new StringBuilder("");

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < M; i++) {
      String str = br.readLine();
      String cmd = "";
      int x = 0;
      if(str.equals("all")) {
        cmd = "all";
      } else if(str.equals("empty")) {
        cmd = "empty";
      }else {
        cmd = str.split(" ")[0];
        x = Integer.parseInt(str.split(" ")[1]);
      }

      switch (cmd) {
        case "add" : add(list, x); break;
        case "check" : check(list, x); break;
        case "remove" : remove(list, x); break;
        case "toggle" : toggle(list, x); break;
        case "all" : all(list); break;
        case "empty" : empty(list); break;
      }
    }
    System.out.println(str);
  }

  static void add(List<Integer> list, int x) {
    if(!list.contains(x)) {
      list.add(x);
    }
  }

  static void remove(List<Integer> list, int x) {
    if(list.contains(x)) {
      list.remove((Integer) x);
    }
  }

  static void check(List<Integer> list, int x) {
    if (list.contains(x)) {
      str.append("1").append("\n");
    } else {
      str.append("0").append("\n");
    }
  }

  static void toggle(List<Integer> list, int x) {
    if(list.contains(x)) {
      list.remove((Integer) x);
    } else {
      list.add(x);
    }
  }

  static void all(List<Integer> list) {
    for(int i = 1; i <= 20; i++) {
      if(!list.contains(i)) {
        list.add(i);
      }
    }
  }

  static void empty(List<Integer> list) {
    list.clear();
  }

}
