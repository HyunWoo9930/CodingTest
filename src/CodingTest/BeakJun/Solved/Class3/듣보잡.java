package CodingTest.BeakJun.Solved.Class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 듣보잡 {
  //HashSet을 써야하는 문제

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int N = Integer.parseInt(str.split(" ")[0]);
    int M = Integer.parseInt(str.split(" ")[1]);
    HashSet<String> listen = new HashSet<>();
    List<String> see = new ArrayList<>();
    for(int i = 0; i < N; i++) {
      listen.add(br.readLine());
    }
    for(int i = 0; i < M; i++) {
      str = br.readLine();
      if(listen.contains(str)) {
        see.add(str);
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(see.size()).append("\n");
    Collections.sort(see);
    for(String string : see) {
      stringBuilder.append(string).append("\n");
    }
    System.out.println(stringBuilder);
  }
}
