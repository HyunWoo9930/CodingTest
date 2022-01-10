package CodingTest.Programmers.Level2.SolvedYet;

public class onetwofourLand {

  public static void main(String[] args) {
    int n = 6;
    int[] nArray = {1,2,4};
    for(int i = 0;i<n;i++) {
      System.out.print(nArray[n/3-1]);
      System.out.println(nArray[n%3-1]);
    }


  }

}
