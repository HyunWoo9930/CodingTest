package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[] arr = new String[n];
    for(int i = 0;i<n;i++) {
      arr[i] = br.readLine();
    }
    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(Integer.parseInt(o1.split(" ")[1]) > Integer.parseInt(o2.split(" ")[1])) {
          return 1;
        } else if(Integer.parseInt(o1.split(" ")[1]) == Integer.parseInt(o2.split(" ")[1])) {
          if(Integer.parseInt(o1.split(" ")[0]) > Integer.parseInt(o2.split(" ")[0])) {
            return 1;
          } else return -1;
        } else return -1;
      }
    });
    for(String a : arr) {
      bw.write(a + "\n");
    }
    bw.flush();
  }
}
