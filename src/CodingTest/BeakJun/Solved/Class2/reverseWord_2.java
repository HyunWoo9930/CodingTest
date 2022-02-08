package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class reverseWord_2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    Stack<String> stack = new Stack<>();
    boolean tag = false;
    StringBuilder result = new StringBuilder();
    for(int i = 0;i<str.length();i++) {
      if(String.valueOf(str.charAt(i)).equals(" ")) {
        while(!stack.isEmpty()) {
          result.append(stack.peek());
          stack.pop();
        } result.append(" ");
      } else if(String.valueOf(str.charAt(i)).equals("<")) {
        tag = true;
        while(!stack.isEmpty()) {
          result.append(stack.peek());
          stack.pop();
        } result.append("<");
      } else if(String.valueOf(str.charAt(i)).equals(">")) {
        tag = false;
        result.append(">");
      } else {
        if(!tag)
        stack.push(String.valueOf(str.charAt(i)));
        else {
          result.append(str.charAt(i));
        }
      }
    }
    while(!stack.isEmpty()) {
      result.append(stack.peek());
      stack.pop();
    }
    bw.write(String.valueOf(result));
    bw.flush();
  }
}
