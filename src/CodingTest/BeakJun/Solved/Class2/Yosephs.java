package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Yosephs {

  public static void main(String[] args) throws IOException {
    Queue<Integer> queue = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();
    String str = br.readLine();
    int n = Integer.parseInt(str.split(" ")[0]);
    int k = Integer.parseInt(str.split(" ")[1]);
    for(int i = 1;i<n+1;i++) {
      queue.add(i);
    }
    int i = 1;
    while(queue.size() > 0) {
      if(i % k != 0) {
        das(queue);
      } else if(i % k == 0) {
        dass(queue,list);
      }
      i++;
    }
    System.out.print("<");
    for(int j = 0;j<list.size();j++) {
      if(j == list.size()-1) {
        System.out.print(list.get(j));
      } else
      System.out.print(list.get(j)+", ");
    }
    System.out.print(">");
  }

  public static Queue<Integer> das(Queue<Integer> queue) {
    int a = queue.peek();
    queue.poll();
    queue.add(a);
    return queue;
  }
  
  public static void dass(Queue<Integer> queue, List<Integer> list) {
    int a = queue.peek();
    queue.poll();
    list.add(a);
  }

}
