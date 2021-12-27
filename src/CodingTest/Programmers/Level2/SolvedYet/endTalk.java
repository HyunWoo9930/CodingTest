package CodingTest.Programmers.Level2.SolvedYet;

import java.util.Arrays;
import java.util.List;

public class endTalk {

  public static void main(String[] args) {
    String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//    String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    int n = 2;
    int fir = 0, sec = 0;
    int[] answer = new int[2];
    for (int i = 1; i < words.length; i++) {
      for (int j = i-1; j >= 0; j--) {
        if (words[i] == words[j]) { // 전이랑 비교했을때 똑같은게 있을때




        }
        else {
          if (!words[i - 1].endsWith(words[i].substring(0, 1))) {




            break;
          }
        }
      }
    }
    answer[0] = fir;
    answer[1] = sec;
    System.out.println("answer[0] = " + answer[0]);
    System.out.println("answer[0] = " + answer[1]);
  }

}
