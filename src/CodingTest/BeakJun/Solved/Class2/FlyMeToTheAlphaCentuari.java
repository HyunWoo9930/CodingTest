package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FlyMeToTheAlphaCentuari {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    for (int i = 0; i < a; i++) {
      String str = br.readLine();
      int x = Integer.parseInt(str.split(" ")[0]);
      int y = Integer.parseInt(str.split(" ")[1]);

      int dis = y - x;
      int j = 1;
      int result = 0;

      int max = (int)Math.sqrt(dis);
      if(dis == max*max) {
        bw.write(String.valueOf(max*2-1) + "\n");
      } else if(max*max < dis && max*max + max >= dis) {
        bw.write(String.valueOf(max*2) + "\n");
      } else {
        bw.write(String.valueOf(max*2+1) + "\n");
      }
      bw.flush();
    }
  }
}
