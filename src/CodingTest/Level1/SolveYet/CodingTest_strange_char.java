package CodingTest.Level1.SolveYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_strange_char {

  public static void main(String[] ar) {
    String s = "try hello world";
    String[] sArr = s.split(" ");
    List<String[]> sList = new ArrayList<>();
    for(int i = 0;i<sArr.length;i++) {
       sList.add(sArr[i].split(""));
    }




    String answer = "";

    System.out.println(answer);
  }
}