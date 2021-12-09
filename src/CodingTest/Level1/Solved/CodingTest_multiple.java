package CodingTest.Level1.Solved;

public class CodingTest_multiple {
  public static void main(String[] ar) {
    int n = 2,m = 5;
    int[] answer = new int[2];
    for(int i = 1;i<Math.max(n,m);i++) {
      if(n % i == 0 && m % i == 0) {
        answer[0] = i;
        answer[1] = (n/i)*(m/i)*(i);
      }
    }

    System.out.println(answer[0]);
    System.out.println(answer[1]);




  }
}
