package CodingTest.Programmers.Level2.Solved;

public class ContinueInt {

  public static void main(String[] args) {
    int n = 15;
    int count = 0;

    for(int i = 1;i<=n;i++) {
      int sum = 0;
      for(int j = i;j<=n;j++) {
        sum += j;
        if(sum == n) {
          count++;
          break;
        }
        else if(sum > n) break;
      }
    }
    System.out.println("count = " + count);
  }
}
