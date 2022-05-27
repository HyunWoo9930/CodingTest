package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xhdrPgkr {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer> nList = new ArrayList<>();
    for(int i = 0;i<n;i++) {
      nList.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(nList);
    tkstnfvudrbs(nList);
    wnddkdrkqt(nList);
    qjadnl(nList);

  }

  public static void tkstnfvudrbs(List<Integer> List) {
    double sum = 0;
    for(int i = 0;i<List.size();i++) {
      sum += List.get(i);
    }
    sum /= List.size();
    sum = Math.round(sum);
    System.out.println((int)sum);
  }

  public static void wnddkdrkqt(List<Integer> List) {
    System.out.println(List.get(List.size()/2));
  }

  public static void chlqlsrkqt(List<Integer> List) {
    for(int i = 0;i<List.size()-1;i++) {
      for(int j = i+1;j<List.size();j++) {
        if(List.get(i) == List.get(j)) {

        }
      }
    }



  }

  public static void qjadnl(List<Integer> List) {
    System.out.println(Math.abs(List.get(List.size()-1) - List.get(0)));
  }




}
