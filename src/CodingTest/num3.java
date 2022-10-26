package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class num3 {

  public static void main(String[] args) throws Exception {
    String sentence = "Jackdaws love my big sphinx of quartz";
    String answer = "";
    HashSet<String> hashSet = new HashSet<>(Arrays.asList(sentence.toLowerCase().split("")));
    String string = Arrays.toString(hashSet.toArray(new String[0]));
    List<Integer> asciicode = new ArrayList<>();
    for(int i =0; i < string.length();i++) {
      char ch = string.charAt(i);
      asciicode.add((int) ch);
    }
    for(int i = 97;i<123; i++) {
      if(!asciicode.contains(i)) {
        answer += Character.toString((char) i);
      }
    }
    if(answer.equals("")) {
      System.out.println("perfect");
    } else{
      System.out.println(answer);
    }
  }
}
