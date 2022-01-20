package CodingTest.Programmers.Level2.Solved;

public class 끝말잇기 {

  public static void main(String[] args) {
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//    String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//    String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//      String[] words = {"land","dream","mom","mom"};
    int n = 3;
//    int n = 5;
//    int n = 2;
//    int n = 2;
    int[] answer = new int[2];
    int a = (getWrong(words));
    if (a != 0) {
      int i = 1;
      while (true) {
        if ((a - n) > 0) {
          a -= n;
          i++;
        } else {
          break;
        }
      }
      answer[0] = a;
      answer[1] = i;
    }
  }

  public static int getWrong(String[] words) {
    String lastword = null;
    for (int i = 1; i < words.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (words[i].equals(words[j])) {
          return i + 1;
        }
      }
    }
    for (int i = 0; i < words.length; i++) {
      if (i > 0) {
        if (!words[i].startsWith(lastword)) {
          return i + 1;
        }
      }
      lastword = String.valueOf(words[i].charAt(words[i].length() - 1));
    }
    return 0;
  }


}
