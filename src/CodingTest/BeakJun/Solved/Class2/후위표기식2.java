package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 후위표기식2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    int[] nArr = new int[n];
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(br.readLine());
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '+'
          && str.charAt(i) != '-') {
        int a = str.charAt(i);
        stack.push((double) nArr[a - 65]);
      } else if (str.charAt(i) == '*') {
        double b = stack.peek();
        stack.pop();
        double a = stack.peek();
        stack.pop();
        stack.push(a * b);
      } else if (str.charAt(i) == '/') {
        double b = stack.peek();
        stack.pop();
        double a = stack.peek();
        stack.pop();
        double c = Math.round(a / b * 100) / 100.0;
        stack.push(c);
      } else if (str.charAt(i) == '+') {
        double b = stack.peek();
        stack.pop();
        double a = stack.peek();
        stack.pop();
        stack.push(a + b);
      } else if (str.charAt(i) == '-') {
        double b = stack.peek();
        stack.pop();
        double a = stack.peek();
        stack.pop();
        stack.push(a - b);
      }
    }
    System.out.println(stack.peek());
  }
}
