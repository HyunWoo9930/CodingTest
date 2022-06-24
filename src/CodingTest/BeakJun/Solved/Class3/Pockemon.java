package CodingTest.BeakJun.Solved.Class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Pockemon {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int N = Integer.parseInt(str.split(" ")[0]);
    int M = Integer.parseInt(str.split(" ")[1]);
    Map<Integer, String> map = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();

    for(int i = 1; i <= N; i++) {
      str = br.readLine();
      map.put(i, str);
      map2.put(str, i);
    }

    for(int i = 0; i < M; i++) {
      str = br.readLine();
      try {
        int num = Integer.parseInt(str);
        bw.write(map.get(num) + "\n");
      } catch (Exception e) {
        bw.write(map2.get(str) + "\n");
      }
    }
    bw.flush();
  }
}
