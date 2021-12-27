package CodingTest.Programmers.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Athletes_not_finish {
  public static void main(String[] ar) {
    // ["leo", "kiki", "eden"]                          	["eden", "kiki"]	                        "leo"
    // ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    // ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	              "mislav"

    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    String answer = "";
    Arrays.sort(participant);
    Arrays.sort(completion);
    int i = 0;
    for(i = 0;i< completion.length;i++) {
        if(participant[i] != completion[i]) {
          answer = participant[i];
         break;
        }
    }
    answer = participant[i];
    System.out.println(answer);
  }
}

