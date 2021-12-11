package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodingTest_Descending {

  public static void main(String[] args) {
    String s = "Zbcdefg";
    String[] sArr = s.split("");
    int[] Ascii = new int[sArr.length];
    int asciicode = 0;
    for(int i = 0;i<s.length();i++) {
      Ascii[i] = ((int)sArr[i].charAt(0));
    }
    Arrays.sort(Ascii);
    String answer = "";
    for(int i = 0; i < Ascii.length;i++) {
      answer += (char)Ascii[Ascii.length-(i+1)];
    }
    System.out.println(answer);








  }

}
