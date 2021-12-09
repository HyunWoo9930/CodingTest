package CodingTest.Level1.Solved;

public class CodingTest_sqrt {
  public static void main(String[] ar) {
    int n = 3;
    double sqrt = Math.sqrt(n);
    if((sqrt * 10) % 10 != 0) sqrt =0;
    double answer = (sqrt == 0)? -1 : Math.pow(sqrt+1,2);
    System.out.println((int)answer);

  }

}
