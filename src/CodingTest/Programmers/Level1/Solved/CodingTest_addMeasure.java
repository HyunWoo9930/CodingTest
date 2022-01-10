package CodingTest.Programmers.Level1.Solved;

public class CodingTest_addMeasure {

  public static void main(String[] args) {
    int n = 5;
    int answer = 0;

    for(int i = 1;i<=n;i++){
      if(n % i == 0) {
        System.out.println(i);
        answer += i;
      }
    }
    System.out.println(answer);
  }

}
