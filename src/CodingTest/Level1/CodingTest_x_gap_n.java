package CodingTest.Level1;

public class CodingTest_x_gap_n {

  public static void main(String[] ar) {
    int x = -4;
    int n = 2;
    long[] answer = new long[n];
    int temp = x;
    for (int i = 0; i < answer.length; i++) {
      answer[i] = x * (i+1);

      System.out.println(answer[i]);
    }
  }
}