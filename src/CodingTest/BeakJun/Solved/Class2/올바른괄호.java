package CodingTest.BeakJun.Solved.Class2;

import java.util.Stack;

public class 올바른괄호 {

  public static void main(String[] args) {
    String str = "()())))()";
    Stack<String> stack = new Stack<>();
    String[] strArr = str.split("");
    int a = str.replaceAll("\\(","").length();
    int b = str.replaceAll("\\)","").length();
    if (str.startsWith(")")) {
      System.out.println(false);
    } else if (str.endsWith("(")) {
      System.out.println(false);
    } else if(a == b) {
      for (int i = 0; i < strArr.length; i++) {
        if (strArr[i].equals("(")) {
          stack.push(strArr[i]);
        } else if (strArr[i].equals(")")) {
          stack.pop();
        }
      }
      if(stack.isEmpty()) {
        System.out.println(true);
      } else {
        System.out.println(false);
      }
    } else {
      System.out.println(false);
    }
  }
}
