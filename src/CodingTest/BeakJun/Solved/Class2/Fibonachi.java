package CodingTest.BeakJun.Solved.Class2;

public class Fibonachi {

  public static void main(String[] args) {
    for(int i = 0;i<100;i++) {
      System.out.println(Fibona(i));
    }
  }

  public static int Fibona(int n) {
    if(n == 0)
      return 0;
    else if(n == 1 || n == 2) {
      return 1;
    }
    else return Fibona(n-1) + Fibona(n-2);
  }

}
