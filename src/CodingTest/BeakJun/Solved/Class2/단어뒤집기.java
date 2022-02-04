package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 단어뒤집기 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    for(int i = 0;i<t;i++) {
      String str = br.readLine();
      Stack<String> stack = new Stack<>();
      StringBuilder result = new StringBuilder();
      for(int j = 0;j<=str.length();j++) {
        if(j == str.length()) {
          while(!stack.isEmpty()) {
            result.append(stack.pop());
          }
        }
        else if(str.charAt(j) != ' ')
          stack.push(String.valueOf(str.charAt(j)));
        else {
          while(!stack.isEmpty()) {
            result.append(stack.pop());
          }
          result.append(" ");
        }
      }
      bw.write(String.valueOf(result) + "\n");
    }
  bw.flush();
  }
}
