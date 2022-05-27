package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutTree {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String str2 = br.readLine();
    int n = Integer.parseInt(str.split(" ")[0]);
    int m = Integer.parseInt(str.split(" ")[1]);
    int[] trees = new int[n];
    for (int i = 0; i < n; i++) {
      trees[i] = Integer.parseInt(str2.split(" ")[i]);
    }
    Arrays.sort(trees);
    for (int i = trees[n - 1]; i > trees[0]; i--) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        if (i < trees[j]) {
          sum += (trees[j] - i);
        }
      }
      if(sum >= m) {
        System.out.print(i);
        break;
      }
    }
  }
}
