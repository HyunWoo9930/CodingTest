package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CutLan {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int k = Integer.parseInt(str.split(" ")[0]);
    int n = Integer.parseInt(str.split(" ")[1]);
    int[] lanArr = new int[k];
    float sum = 0;
    for(int i = 0;i<k;i++) {
      lanArr[i] = Integer.parseInt(br.readLine());
      sum += lanArr[i];
    }
    System.out.println(sum);
    float sums = sum / n;
    System.out.println(sums);


  }

}
