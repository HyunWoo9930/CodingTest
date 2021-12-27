package CodingTest.Programmers.Level2.SolvedYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Skoville {

  public static void main(String[] args) {
    int[] scovilles = {1, 2, 3, 9, 10, 12};
    int k = 7;
    int scoville = 0;
    List<Integer> scovilleList = Arrays.stream(scovilles).boxed().collect(Collectors.toList());
    Collections.sort(scovilleList);
    for(int i = 0;i<scovilles.length-1;i++) {
      scoville = scovilleList.get(i) + scovilleList.get(i+1) * 2;
      scovilleList.remove(i);
      scovilleList.remove(i);
      scovilleList.add(scoville);
      Collections.sort(scovilleList);
      System.out.println("scovilleList = " + scovilleList);
    }


  }

}
