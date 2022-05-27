package CodingTest.BeakJun.SolvedYet.Class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReverseWord {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String[] strArr;
    String str;
    StringBuffer sb;
    String reversedStr;
    for(int i = 0;i<n;i++) {
      str = br.readLine();
      strArr = str.split(" ");
      String result = "";
      for(int j = 0;j<strArr.length;j++) {
        sb = new StringBuffer(strArr[j]);
        reversedStr = sb.reverse().toString();
        result += reversedStr;
        result += " ";
      }
      bw.write(result + "\n");
    }
    bw.flush();
  }
}
