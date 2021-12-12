package CodingTest.Level1.SolveYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_Athletes_not_finish {
  public static void main(String[] ar) {
    // ["leo", "kiki", "eden"]                          	["eden", "kiki"]	                        "leo"
    // ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    // ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	              "mislav"

    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    String answer = "";
//    for(int i = 0;i< participant.length;i++) {
//      for(int j = 0;j< completion.length;j++) {
//        if(participant[i] == completion[j]) {
//         participant[i] = "";
//         completion[j] = "";
//         break;
//        }
//      }
//      if(!participant[i].isEmpty()) answer = participant[i];
//    }
    List<String> participantList = Arrays.stream(participant).toList();
    List<String> completionList = Arrays.stream(completion).toList();
//    for(int i = 0;i<completion.length;i++) {
//      if(participantList.contains(completion[i])) {
//        participantList.remove("stanko");
//
//      }
//    }
    participantList.remove(new String("stanko"));

    System.out.println(answer);
  }




  }

