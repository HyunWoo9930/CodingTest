package CodingTest.utplus;

public class num2 {

  public static void main(String[] args) throws Exception {
    int[] arr = {5, 1, 9, 8, 10, 5};
//    int[] arr = {10,1,10,1,1,4,3,10};
    int k = 3;
    int max = 0;
    for (int i = 0; i < arr.length - k; i++) {
      int sum = 0;
      for (int j = 1; j <= k; j++) {
        sum += arr[i + j];
      }
      max = Math.max(max, sum);
    }
    System.out.println(max);
  }
}
