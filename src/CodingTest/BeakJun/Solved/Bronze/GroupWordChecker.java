package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < a; i++) {
      String str = br.readLine();
      if(wordCheck(str)) {
        count++;
      }
    }
    System.out.println(count);
  }

  public static boolean wordCheck(String a) {
    String[] sArr = a.split("");

    for (int i = 0; i < sArr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (sArr[i].equals(sArr[j])) {
          if (i != j + 1) {
            for(int k = j+1;k<i;k++) {
              if(!sArr[i].equals(sArr[k])) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }
}
