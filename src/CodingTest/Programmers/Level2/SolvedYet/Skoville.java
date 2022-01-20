package CodingTest.Programmers.Level2.SolvedYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Skoville {

  public static void main(String[] args) {
    int[] scovilles = {1, 2, 3, 9, 10, 12};
    int k = 7;
    int scoville = 0;
    Arrays.sort(scovilles);

    // 가장 작은 두개 스코빌을 만들어서, 새로운 리스트에 넣어줌.
    int i = 0;
    List<Integer> notSpicy = new ArrayList<>();
    while (scovilles[i] < k) {
      notSpicy.add(scovilles[i]);
      i++;
    }
    Stack<Integer> stack = new Stack<>();
    for(int j = notSpicy.size()-1;j>=0;j--) {
      stack.push(notSpicy.get(j));
    }
    while(true) {
      if(stack.size() > 1) {
        int stackPop = stack.pop() + stack.pop() * 2;
      } else break;
    }



  }

}
