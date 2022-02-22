package CodingTest.BeakJun.Solved.Class2;

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
      } else if(countChar(str,"\\(") != countChar(str,"\\)")) {
        answer.append("NO\n");
        continue;
      }
      for (int j = 0; j < str.length(); j++) {
        if(str.charAt(j) == '(') {
          stack.push("(");
        } else {
          if(stack.isEmpty()) {
            stack.push(".");
            break;
          } else {
            stack.pop();
          }
        }
      }
      if(stack.isEmpty()) {
        answer.append("YES" + "\n");
      } else {
        answer.append("NO" + "\n");
      }
    }
    System.out.println(answer);
  }

  public static int countChar(String a, String b) {
    String c = a.replaceAll(b,"");
    return a.length()-c.length();
  }
}