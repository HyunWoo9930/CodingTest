package CodingTest.Programmers.Level2.SolvedYet;

public class Nmin {

  public static void main(String[] args) {
    int[] arr = {2,6,8,14};
    for(int i = 0;i<arr.length;i++) {
      for(int j = i+1;j<arr.length;j++) {
        System.out.println("arr[i] = " + arr[i]);
        System.out.println("arr[j] = " + arr[j]);
      }
    }
  }

}
