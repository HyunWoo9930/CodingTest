package CodingTest.utplus;

import java.util.Arrays;
import java.util.Stack;

public class num1 {

  public static void main(String[] args) throws Exception {
//    int[] arr = {2,1,3,3};
//    int[] arr = {3,4,4,2,5,2,5,5};
    int[] arr = {3,5,3,5,7,5,7}; // {3,3,5,5,7,7}
    Stack<Integer> stack = new Stack<>();
    Arrays.sort(arr);
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    for(int num : arr) {
      if(stack.size() == 0) {
        stack.add(num);
      } else if(stack.contains(num)) {
        stack.pop();
      } else {
        stack.add(num);
      }
    }
    System.out.println("stack = " + stack);
  }
}
