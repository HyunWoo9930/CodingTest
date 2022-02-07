package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int m = Integer.parseInt(br.readLine());
    Stack<String> stack = new Stack<>();
    String[] strArr = str.split("");
    for(String a : strArr) {
      stack.push(a);
    }
    Stack<String> rest = new Stack<>();
    for(int i = 0;i<m;i++) {
      String s = br.readLine();
      if(s.equals("L")) {
        if(!stack.isEmpty()) {
          rest.push(stack.peek());
          stack.pop();
        }
      } else if(s.equals("D")) {
        if(!rest.isEmpty()) {
          stack.push(rest.peek());
          rest.pop();
        }
      } else if(s.equals("B")) {
        if(!stack.isEmpty()) {
          stack.pop();
        }
      } else {
       String p = s.split(" ")[1];
       stack.push(p);
      }
    }
    StringBuilder stringrest = new StringBuilder();
    while(!rest.isEmpty()) {
      stringrest.append(rest.peek());
      rest.pop();
    }
    StringBuilder stringstack = new StringBuilder();
    while(!stack.isEmpty()) {
      stringstack.append(stack.peek());
      stack.pop();
    }
    StringBuilder result = stringstack.reverse().append(stringrest);
    System.out.println(result);
  }
}
