package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class qnsughlwkddlehlfrjdi {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());

    int[][] apart = new int[15][15];
    for(int i = 0;i<15;i++) {
      apart[i][1] = 1;
      apart[0][i] = i;
    }

    for(int i = 1;i<15;i++) {
      for(int j = 2;j< 15;j++) {
        apart[i][j] = apart[i][j-1] + apart[i-1][j];
      }
    }
//    for(int i = 0;i<15;i++) {
//      for(int j = 0;j<15;j++) {
//        System.out.print(apart[i][j] + " ");
//      }
//      System.out.println();
//    }

    for(int i = 0;i<t;i++) {
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      bw.write(apart[a][b] + "\n");
    }
bw.flush();
  }
}