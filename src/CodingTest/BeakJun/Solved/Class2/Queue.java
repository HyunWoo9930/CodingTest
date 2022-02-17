package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Queue {

  public static void main(String[] args) throws IOException {
    List<Integer> list = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for(int i = 0;i<n;i++) {
      String str = br.readLine();
      if(str.contains("push")) {
        int a = Integer.parseInt(str.split(" ")[1]);
        Push(list,a);
      } else if(str.equals("pop")) {
        if(list.size() == 0) {
          System.out.println(-1);
        } else {
          System.out.println(list.get(0));
          list = Pop(list);
        }
      } else if(str.equals("size")) {
        System.out.println(Size(list));
      } else if(str.equals("empty")) {
        System.out.println(empty(list));
      } else if(str.equals("front")) {
        System.out.println(front(list));
      } else if(str.equals("back")) {
        System.out.println(back(list));
      }
    }
  }

  public static List<Integer> Push(List<Integer> list,int n) {
    list.add(n);
    return list;
  }

  public static List<Integer> Pop(List<Integer> list) {
    if (list.size() == 0) {
      return list;
    } else {
      List<Integer> list1 = new LinkedList<>();
      for (int i = 1; i < list.size(); i++) {
        list1.add(list.get(i));
      }
      list = list1;
      return list;
    }
  }
  public static int Size(List<Integer> list) {
    return list.size();
  }

  public static int empty(List<Integer> list) {
    return list.size() == 0? 1 : 0;
  }

  public static int front(List<Integer> list) {
    return list.size() == 0? -1 :list.get(0);
  }

  public static int back(List<Integer> list) {
    return list.size() == 0? -1 : list.get(list.size()-1);
  }

}
