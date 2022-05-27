package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrinterQueue {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int j = Integer.parseInt(br.readLine());
    for(int i = 0;i<j;i++) {
      String str = br.readLine();
      String str1 = br.readLine();
      int n = Integer.parseInt(str.split(" ")[0]); // 4
      int m = Integer.parseInt(str.split(" ")[1]); // 2
      int[] arr = new int[n];
      Character[] charArr = new Character[n];
      for(int k = 0; k < n;k++) {
        charArr[k] = (char) (k+65); // [A,B,C,D]
        arr[k] = Integer.parseInt(str1.split(" ")[k]); // [1,2,3,4]
      }


    }
  }
}
