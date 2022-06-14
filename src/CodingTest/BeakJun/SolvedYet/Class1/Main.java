package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String str = br.readLine();
      if(str.equals("#")) break;
      else {
        int a = str.length();
        str = str.replaceAll("[aA]", "");
        str = str.replaceAll("[eE]", "");
        str = str.replaceAll("[iI]", "");
        str = str.replaceAll("[oO]", "");
        str = str.replaceAll("[uU]", "");
        System.out.println(a - str.length());
      }
    }
  }
}
