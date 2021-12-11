package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_strange_char {

  public static void main(String[] ar) {
    String s = "try hello world";
    String[] sArr = s.split(" ",-1);
    String answer = "";
    for(int i = 0;i< sArr.length;i++) {
      String[] sArrs = sArr[i].split("");
      for(int j = 0;j< sArrs.length;j++) {
        if(j % 2 == 0) {
          sArrs[j] = sArrs[j].toUpperCase();
        }
        else sArrs[j] = sArrs[j].toLowerCase();
        answer += sArrs[j];
      }
      answer += " ";
    }
    answer = answer.substring(0,answer.length()-1);






    System.out.println(answer);
  }
}