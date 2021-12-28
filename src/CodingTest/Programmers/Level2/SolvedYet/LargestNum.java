package CodingTest.Programmers.Level2.SolvedYet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LargestNum {

  public static void main(String[] args) {
    String num = "1924";
    int k = 6;
    Pick(num,k);
  }

  public static int Pick(String num,int k) {
    int answer = 0;
    int temp = 0;
    int[] test = new int[k];
    Random rand = new Random();
    for(int i = 0;i<k;i++) test[i] = i;
    for(int i = 0;i<k;i++) {
      int des = rand.nextInt(k);
      temp = test[i];
      test[i] = test[des];
      test[des] = temp;
    }
    for(int i = 0;i<test.length;i++) {
      System.out.println("" + test[i]);
    }




    return answer;
  }

}
