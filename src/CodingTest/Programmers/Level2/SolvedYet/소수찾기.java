package CodingTest.Programmers.Level2.SolvedYet;

public class 소수찾기 {

  public static void main(String[] args) {
    String numbers = "17";
    String[] numbersArr = numbers.split("");

    for(int i = 1;i<=numbersArr.length;i++) {
      int decimal = 0;
      for(int j = 0;j<numbersArr.length;j++) {
        decimal = Integer.parseInt(numbersArr[j]);
      }



    }
  }



  public static boolean IsDecimal(int a) {
    if(a == 1) return false;
    for(int i = 1;i<1000;i++) {
      if(a % i == 0) {
        if(i != 1 && i != a) {
          return false;
        }
      }
    }
    return true;
  }

  public static void PickN (String[] numbersArr,int a) {




  }



}
