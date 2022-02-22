package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(br.readLine());
      if (a == 0) {
        if(i == 0) {
          continue;
        }
        stack.pop();
      } else {
        stack.push(a);
      }
    }
    int answer = 0;
    for(int a : stack) {
      answer += a;
    }
    System.out.println(answer);
  }
}
