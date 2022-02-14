package CodingTest.Programmers.Level2.Solved;

import java.util.Stack;

public class Nnum최소공배수 {

  public static void main(String[] args) {
//    int[] arr = {2, 6, 8, 14};
//    int[] arr = {3,4,9,16};
    int[] arr = {1,2,3};
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<arr.length;i++) {
      stack.push(arr[i]);
    }
    while(stack.size() != 1) {
      int a = stack.pop();
      int b = stack.pop();
      stack.push((a * b) / GCD(a,b));
    }
    int answer = stack.pop();
  }

  public static int GCD(int a,int b) {
    if(b == 0) {
      return a;
    } else {
      return GCD(b,a%b);
    }
  }
}
