package CodingTest.Level1.SolveYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Stringsort_mymind {
  public static void main(String[] ar) {
    String[] strings = {"ae", "ae", "be", "ce"};
    int n = 1;
    String[] strings2 = new String[strings.length];
    String[] answer = new String[strings.length];
    for(int i = 0; i<strings.length;i++){
      strings2[i] = strings[i].substring(n);
      System.out.println(strings2[i]);
    }
    System.out.println();
    for(int i = 0; i< strings2.length-1;i++) {
      for(int j = i + 1;j<strings2.length;j++) {
        if(strings2[i].compareTo(strings2[j]) > 0) {
          String temp = strings2[i];
          strings2[i] = strings2[j];
          strings2[j] = temp;
        }
      }

    }
    for(int i = 0;i<strings.length;i++) {
      System.out.println(strings2[i]);
    }
    System.out.println();
    for(int i = 0;i<strings2.length;i++){
      for(int j = 0;j<strings.length;j++) {
        if(strings[i].substring(n).equals(strings2[j])) {
          answer[j] = strings[i];
        }
      }
    }

for(int i = 0;i< strings.length;i++) {
  System.out.println(answer[i]);
}


  }
}
