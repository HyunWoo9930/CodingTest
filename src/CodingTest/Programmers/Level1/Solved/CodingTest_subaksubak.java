package CodingTest.Programmers.Level1.Solved;

public class CodingTest_subaksubak {
  public static void main(String[] ar) {
    int n = 5;
    String answer = "";
    for(int i = 1;i<= n ;i++){
      if(i % 2 == 1) {
        answer += "수";
      }
      else {
        answer += "박";
      }
    }
    System.out.println(answer);

  }
}
