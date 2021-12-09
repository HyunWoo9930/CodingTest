package CodingTest.Level1.Solved;

public class CodingTest_dotProduct {
  public static void main(String[] ar) {
    // a              b              return
    // [1,2,3,4]	    [-3,-1,0,2]	     3
    // [-1,0,1]	      [1,0,-1]	      -2

    // a[0]*b[0] + a[1]b[1] + ... + a[n-1]b[n-1]
    int[] a = {-1,0,1};
    int[] b = {1,0,-1};
    int result = 0;
    for(int i = 0 ; i< a.length;i++) {
      result += a[i] * b[i];
    }
    System.out.println(result);
  }
}
