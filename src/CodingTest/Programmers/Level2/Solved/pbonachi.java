package CodingTest.Programmers.Level2.Solved;

public class pbonachi {

  public static void main(String[] args) {
    int n = 5;
    int nNumn = 0;
    int i = 1;
    int nNumm = 1;
    int answer = 0;
    while (i < n) {
       answer = nNumm + nNumn;
       nNumn = nNumm % 1234567;
       nNumm = answer % 1234567;
       i++;
    }
    answer %= 1234567;
    System.out.println(answer);
  }
}
