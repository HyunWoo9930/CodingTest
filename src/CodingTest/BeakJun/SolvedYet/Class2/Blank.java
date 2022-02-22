package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Blank {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < a; i++) {
      String str = br.readLine();
      Stack<String> stack = new Stack<>();
      if(str.startsWith(")")) {
        answer.append("NO\n");
        continue;
      }
      else if(str.endsWith("(")) {
        answer.append("NO\n");
        continue;
      }
      for (int j = 0; j < str.length(); i++) {
        if(str.charAt(j) == '(') {
          stack.push("(");
        } else {
          if(!stack.isEmpty()) {
            stack.pop();
          }
          System.out.println(stack);
        }



      }
    }

  }
}