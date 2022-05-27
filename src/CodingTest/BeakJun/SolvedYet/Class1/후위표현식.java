package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표현식 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Stack<String> stack = new Stack<>();
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '(' && str.charAt(i) != ')') {
        answer += str.charAt(i);
      } else if(str.charAt(i) == '+') {
        if(stack.peek().equals("*") || stack.peek().equals("/")) {
          while(!stack.isEmpty()) {
            answer += stack.pop();
          }
        }
        stack.push(String.valueOf(str.charAt(i)));
      } else if(str.charAt(i) == '-') {
        if(stack.peek().equals("*") || stack.peek().equals("/")) {
          while(!stack.isEmpty()) {
            answer += stack.pop();
          }
        }
        stack.push(String.valueOf(str.charAt(i)));
      } else if(str.charAt(i) == '*') {
        stack.push(String.valueOf(str.charAt(i)));
      } else if(str.charAt(i) == '/') {
        stack.push(String.valueOf(str.charAt(i)));
      } else if(str.charAt(i) == '(') {
        stack.push(String.valueOf(str.charAt(i)));
      } else if(str.charAt(i) == ')') {
        while(true) {
          if(stack.peek().equals("("))
            break;
          answer += stack.pop();
        }
        stack.pop();
      }

    }
    System.out.println(answer);
  }

}
