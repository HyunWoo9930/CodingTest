package CodingTest.BeakJun.Solved.Class2;

import java.io.IOException;
import java.util.Scanner;

public class 덩치 {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] arr = new int[n][2];
    for(int i=0;i<n;i++) {
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
    }

    for(int i = 0;i < n; i++) {
      int rank = 1;
      for(int j = 0; j < n; j++) {
        if(i == j) continue;
        else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          rank++;
        }
      }
      System.out.print(rank + " ");
    }



  }
}
