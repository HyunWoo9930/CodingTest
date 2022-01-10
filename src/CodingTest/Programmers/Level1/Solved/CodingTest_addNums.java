package CodingTest.Programmers.Level1.Solved;

public class CodingTest_addNums {

  public static void main(String[] ar) {
    int n = 123;
    int answer = 0;
    System.out.println(n % 10);
    while(n / 10 != 0) {
      answer += (n % 10);
      n /= 10;

    }
    answer += n;
    System.out.println(answer);
  }
}
