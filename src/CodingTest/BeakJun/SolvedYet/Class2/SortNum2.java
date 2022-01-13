package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNum2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    List<Integer> nList = new ArrayList<>();
    for(int i = 0;i<n;i++) {
      nList.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(nList);
    for(int i = 0;i<nList.size();i++) {
      bw.write(nList.get(i)+"\n");
    }
    bw.flush();
  }

}
