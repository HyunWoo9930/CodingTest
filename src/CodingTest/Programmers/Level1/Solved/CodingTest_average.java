package CodingTest.Programmers.Level1.Solved;

public class CodingTest_average {
  public static void main(String[] ar) {
    int[] arr = {1,2,3,4};
    int sum = 0;
    for(int i = 0;i<arr.length;i++) {
      sum += arr[i];
    }
    float answer = (float)sum / arr.length;
    System.out.println(sum);
    System.out.println(arr.length);
    System.out.println(answer);
  }
}
