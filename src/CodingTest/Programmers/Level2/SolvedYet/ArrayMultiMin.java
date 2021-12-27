package CodingTest.Programmers.Level2.SolvedYet;

import java.util.ArrayList;
import java.util.List;

public class ArrayMultiMin {

  public static void main(String[] args) {
    int[] a = {1,4,2} , b = {5,4,4};
    List<Integer> results = new ArrayList<>();
    int result = 0;



    for(int i = 0;i<a.length;i++) {
      for (int j = 0; j < b.length; j++) {
        result = a[i] * b[j];
        results.add(result);
      }
    }
    System.out.println("result = " + results);


  }
}
