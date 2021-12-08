package CodingTest.Level1;

public class CodingTest_hashard_num {
  public static void main(String[] ar) {
    int i = 111;

    int c=0,d=0,e=0;
    int a = i / 10;
    if(a > 9) {
      c = a / 10;
      a = a % 10;
      if(c > 9) {
        d = c / 10;
        c = c % 10;
        if(d > 9) {
          e = d / 10;
          d = d % 10;
        }
      }
    }
    int b = i % 10;
    boolean answer = false;
    System.out.println("a : " +a + "  b : " + b + " c : " +c + "  d : " + d+ " e : " +e);
    if(i % (a+b+c+d+e) == 0) {
      answer = true;
    }
    else {
      answer = false;
    }
    System.out.println(answer);
  }
}
