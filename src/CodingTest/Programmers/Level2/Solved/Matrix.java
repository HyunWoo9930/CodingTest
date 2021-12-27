package CodingTest.Programmers.Level2.Solved;

public class Matrix {

  public static void main(String[] args) {
//    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
//    int[][] arr2 = {{3, 3}, {3, 3}};
    int [][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
    int [][] arr2 = {{5,4},{2,4},{3,1}};
//    int [][] arr1 = {{1,2,3},{4,5,6}};
//    int [][] arr2 = {{1,4},{2,5},{3,6}};
    int[][] answer = new int[arr1.length][arr2[0].length];
    for (int i = 0; i < arr1.length; i++) { // 3
      for (int j = 0; j < arr2[0].length; j++) { // 2
        for (int k = 0; k < arr1[i].length; k++) { // 2
             answer[i][j] += arr1[i][k] * arr2[k][j];
        }
        System.out.println("answer[i][j] = " + answer[i][j]);
      }
    }
  }
}
