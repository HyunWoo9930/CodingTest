package CodingTest.Programmers.Level1.KaKao.Solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CodingTest_Crane {

  public static void main(String[] ar) {
    int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0},
        {0, 2, 1, 0, 0}};
    int[] moves = {1, 2, 3, 3, 2, 3, 1};
    Stack<Integer> stack = new Stack<>();
    int latest = 0;
    int answer = 0;
    for (int i = 0; i < moves.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][moves[i] - 1] != 0) {
          stack.push(board[j][moves[i] - 1]);
          if (latest == stack.peek() && stack.size() >= 2) {
            stack.pop();
            stack.pop();
            answer += 2;
          }
          if(stack.size() != 0)
          latest = stack.peek();
          if(stack.size() == 0) latest = 0;
          System.out.println(latest);
          board[j][moves[i] - 1] = 0;
          break;
        }
      }
    }
    System.out.println(stack);
    System.out.println(answer);


  }
}


