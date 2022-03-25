package CodingTest.BeakJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Zipwhkvy {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str.split(" ")[i]);
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        map.put(arr[i], 0);
    }
    Object[] mapArr = map.keySet().toArray();
    Arrays.sort(mapArr);
    for(int i = 0;i<mapArr.length;i++) {
      map.put((Integer) mapArr[i],i);
    }
    StringBuilder sb = new StringBuilder();
    for(int i : arr) {
      sb.append(map.get(i)).append(" ");
    }
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}
