package CodingTest.Programmers.Level1.Solved;

public class CodingTest_Procession {
  public static void main(String[] ar) {
    int[][] arr = {{1},{2}};
    int[][] arr2 = {{3},{4}};
    int[][] answer = new int[arr.length][arr[0].length];

    for(int i = 0;i < arr.length;i++) {
      for(int j = 0;j < arr[0].length;j++) {
        answer[i][j] = arr[i][j] + arr2[i][j];
        System.out.println(answer[i][j]);
      }
    }






  }
}
