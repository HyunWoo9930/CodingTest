package CodingTest.Programmers.Level2.Solved;

import java.util.Arrays;

public class prefix {

  public static void main(String[] args) {
    String[] phoneBook = {"123", "456", "789"};
    boolean answer = true;
    Arrays.sort(phoneBook);
    for(int i = 0;i< phoneBook.length-1;i++) {
      if(phoneBook[i+1].startsWith(phoneBook[i])) {
        answer = false;
      }
    }
    System.out.println("answer = " + answer);
  }
}