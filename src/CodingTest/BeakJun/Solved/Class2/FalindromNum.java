package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FalindromNum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true) {
      String a = br.readLine();
      if(a.equals("0")) break;
      else {
        String[] aArr = a.split("");
        if (aArr.length == 1) {
          System.out.println("yes");
        } else if(aArr.length == 2) {
          if(aArr[0].equals(aArr[1])) {
            System.out.println("yes");
          } else {
            System.out.println("no");
          }
        } else if(aArr.length == 3) {
          if(aArr[0].equals(aArr[2])) {
            System.out.println("yes");
          } else {
            System.out.println("no");
          }
        } else if(aArr.length == 4) {
          if(aArr[0].equals(aArr[3]) && aArr[1].equals(aArr[2])) {
            System.out.println("yes");
          } else {
            System.out.println("no");
          }
        } else if(aArr.length == 5) {
          if(aArr[0].equals(aArr[4]) && aArr[1].equals(aArr[3])) {
            System.out.println("yes");
          } else {
            System.out.println("no");
          }
        }
      }
    }
  }
}
