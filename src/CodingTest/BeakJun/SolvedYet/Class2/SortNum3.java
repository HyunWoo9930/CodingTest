package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortNum3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] nArr = new String[n];
    for(int i = 0 ;i<n;i++) {
      nArr[i] = br.readLine();
    }
    System.out.println(Arrays.toString(nArr));
    // [5, 2, 3, 1, 4, 2, 3, 5, 1, 7]
    Arrays.sort(nArr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.charAt(n) > o2.charAt(n))
          return 1;
        else return -1;
      }
    });
    System.out.println(Arrays.toString(nArr));


  }

}
