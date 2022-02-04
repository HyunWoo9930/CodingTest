package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stacktnduf {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(br.readLine());
    }
    Stack<Integer> stack = new Stack<>();
    for (int i = 1; i <= n; i++) {
      if(i != nArr[i-1]) {
        stack.push(i);
        System.out.println("+");
      }
    }


  }

}
