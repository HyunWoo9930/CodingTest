package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stacktnduf {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    StringBuilder answer = new StringBuilder();
    int m = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());
      if(x > m) {
        while(x > m) {
          stack.push(++m);
          answer.append("+"+"\n");
        }
        stack.pop();
        answer.append("-"+"\n");
      } else {
        boolean found = false;
        if(!stack.isEmpty()) {
          int top = stack.peek();
          stack.pop();
          answer.append("-"+"\n");
          if(x == top) {
            found = true;
          }
        }
        if(!found) {
          answer = new StringBuilder("NO");
          break;
        }
      }
    }
    bw.write(answer.toString());
    bw.flush();
  }
}
