package CodingTest.KaKao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Crane {

  public static void main(String[] ar) {
    int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}};
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    int character = 0;
    List<int[]> movesList = new ArrayList<>();
    for (int i = 0; i < moves.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if(board[j][moves[i]-1] != 0) {
          character = board[j][moves[i]-1];
          //System.out.println(character);
          board[j][moves[i]-1] = 0;
          break;
        }




      }
    }
    System.out.println(movesList);

  }
}


