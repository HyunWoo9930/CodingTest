package CodingTest.Programmers.Level2.SolvedYet;

public class LargestSquare {

  public static void main(String[] args) {
    int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
//    0111
//    1111
//    1111
//    0010
    int count = 0;
    int count2 = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 0) {
          continue;
        } else if (board[i][j] == 1) {
          count2++;
          for (int k = i; k < board[i].length; k++) {
            if (board[k][j] == 1) {
              System.out.println(board[k][j]);
              count++;
            }

            else break;
          }

        }
        System.out.println("count = " + count);
        System.out.println("count2 = " + count2);
        System.out.println();
        count = 0;
        count2 = 0;
      }


    }
  }

}
