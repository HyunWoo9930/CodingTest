package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Deque {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    for(int i = 0;i<n;i++) {
      String str = br.readLine();
      if(str.equals("pop_front")) {
        list = pop_front(list);
      } else if(str.equals("pop_back")) {
        list = pop_back(list);
      } else if(str.equals("size")) {
        System.out.println(size(list));
      } else if(str.equals("empty")) {
        System.out.println(empty(list));
      } else if(str.equals("front")) {
        System.out.println(front(list));
      } else if(str.equals("back")) {
        System.out.println(back(list));
      } else if(str.contains("front")) {
        int a = Integer.parseInt(str.split(" ")[1]);
        list = push_front(list,a);
      } else if(str.contains("back")) {
        int a = Integer.parseInt(str.split(" ")[1]);
        list = push_back(list,a);
      }
    }
  }

  public static List<Integer> push_front(List<Integer> list, int a) {
    List<Integer> list2 = new ArrayList<>();
    list2.add(a);
    for (int b : list) {
      list2.add(b);
    }
    return list2;
  }

  public static List<Integer> push_back(List<Integer> list, int a) {
    list.add(a);
    return list;
  }

  public static List<Integer> pop_front(List<Integer> list) {
    List<Integer> list1 = new ArrayList<>();
    if(list.isEmpty()) {
      System.out.println(-1);
      return list;
    }
    for (int i = 1; i < list.size(); i++) {
      list1.add(list.get(i));
    }
    System.out.println(list.get(0));
    return list1;
  }

  public static List<Integer> pop_back(List<Integer> list) {
    List<Integer> list1 = new ArrayList<>();
    if(list.isEmpty()) {
      System.out.println(-1);
      return list;
    }
    for (int i = 0; i < list.size() - 1; i++) {
      list1.add(list.get(i));
    }
    System.out.println(list.get(list.size()-1));
    return list1;
  }

  public static int size(List<Integer> list) {
    return list.size();
  }

  public static int empty(List<Integer> list) {
    return list.isEmpty() ? 1 : 0;
  }

  public static int front(List<Integer> list) {
    if(list.isEmpty()) {
      return -1;
    }
    return list.get(0);
  }

  public static int back(List<Integer> list) {
    if(list.isEmpty()) {
      return -1;
    }
    return list.get(list.size() - 1);
  }
}
