package CodingTest.Level1;

public class CodingTest_PlusMinus {
  public static void main(String[] ar) {
    int[] absolutes = {4,7,12};
    Boolean[] signs = {true,false,true};
    int sum = 0;

    for(int i = 0 ; i < signs.length; i++) {
      if(signs[i] == true) {
        absolutes[i] = absolutes[i];
      }
      else {
        absolutes[i] = -absolutes[i];
      }
      sum += absolutes[i];
    }
    System.out.println(sum);


  }

}
