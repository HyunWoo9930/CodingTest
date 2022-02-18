package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class balancedWorld {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while(true) {
      String str = br.readLine();
      Stack<String> stack1 = new Stack<>();
      Stack<String> stack2 = new Stack<>();
      if(str.equals(".")) {
        break;
      }
      for(int i = 0;i<str.length();i++) {
        if(String.valueOf(str.charAt(i)).equals("(")) {
          stack1.push("(");
        } else if(String.valueOf(str.charAt(i)).equals(")")) {
          if(stack1.isEmpty()) {
            System.out.println("no");
            break;
          }
          else stack1.pop();
        } else if(String.valueOf(str.charAt(i)).equals("[")) {
          stack2.push("[");
        } else if(String.valueOf(str.charAt(i)).equals("]")) {
          if(stack2.isEmpty()) {
            System.out.println("no");
            break;
          }
          else stack2.pop();
        }
      }
    }
  }

}
