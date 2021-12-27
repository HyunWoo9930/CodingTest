package CodingTest.Programmers.Level1.Solved;

public class CodingTest_CalSlackMoney {
  public static void main(String[] ar) {
    int price= 3,money=20,count=4;
    int totalMoney = 0;
    int ridecount = 1;
    while(count != 0) {
      totalMoney += price * ridecount;
      System.out.println(totalMoney);
      count--;
      ridecount++;
    }
    int result = (totalMoney - money>=0)?0:totalMoney-money;

  }
}
