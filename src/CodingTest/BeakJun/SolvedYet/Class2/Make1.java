package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int count = 0;
    System.out.println(make1(a,count));



  }

  public static int make1(int a,int count) {
    if(a == 1) {
      return count;
    } else if(a % 3 == 0) {
      count++;
      System.out.println("3의 배수");
      return make1(a/3,count);
    } else if(a % 2 == 0) {
      count++;
      System.out.println("2의 배수");
      return make1(a/2,count);
    } else {
      count++;
      System.out.println("3의 배수 2의 배수 아님");
      return make1(a-1,count);
    }
  }

}
