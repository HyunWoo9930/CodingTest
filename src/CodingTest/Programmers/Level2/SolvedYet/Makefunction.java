package CodingTest.Programmers.Level2.SolvedYet;

public class Makefunction {

  public static void main(String[] args) {
    int[] a = {93,30,55};
    int[] b = {1,30,5};
    for(int i = 0;i<a.length;i++) {
      a[i] = ((100-a[i]) % b[i] == 0)? (100 -a[i])/b[i] : (100-a[i])/b[i] + 1;
      System.out.println(a[i]);
    }
    int day = a[0];
    for(int i = 0;i<a.length;i++) {

      if(day > a[i]) continue;
      else {
        day = a[i];
        System.out.println("i = " + i);
      }
    }

  }
}
