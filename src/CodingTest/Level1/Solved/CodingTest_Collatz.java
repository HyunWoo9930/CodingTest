package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.List;

public class CodingTest_Collatz {
  public static void main(String[] ar) {
    int num = 6;
    int answer = 0;

    while(num!=1) {
      if(num%2==0) {
        num /= 2;
      } else {
        num = 3*num + 1;
      }

      answer++;
      if(answer==500) {
        answer=-1; break;
      }
    }
System.out.println(answer);
  }
}
