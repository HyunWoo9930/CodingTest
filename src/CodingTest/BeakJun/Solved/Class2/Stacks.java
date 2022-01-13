package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stacks {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<N;i++) {
      String str = br.readLine();
      if(str.contains("push")) {
        int a = Integer.parseInt(str.split(" ")[1]);
        Push(a,stack);
      }
      else  if(str.equals("pop")) {
        Pop(stack);
      }
      else if(str.equals("size")) {
        Size(stack);
      }
      else if(str.equals("empty")) {
        Empty(stack);
      }
      else if(str.equals("top")) {
        Top(stack);
      }
    }

  }

  public static Stack<Integer> Push(int a,Stack<Integer> stack) {
    stack.push(a);
    return stack;
  }

  public static void Pop(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      System.out.println(-1);
    } else {
      System.out.println(stack.pop());
    }
  }

  public static void Size(Stack<Integer> stack) {
    System.out.println(stack.size());
  }

  public static void Empty(Stack<Integer> stack) {
    System.out.println((stack.empty())?1:0);
  }

  public static void Top(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      System.out.println(-1);
    } else {
      System.out.println(stack.peek());
    }
  }
}
