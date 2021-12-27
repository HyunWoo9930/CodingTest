package CodingTest.Programmers.Level2.Solved;

public class MaxMin {

  public static void main(String[] args) {
    String s = "-1 -1";
    //"1 2 3 4"	            "1 4"
    //"-1 -2 -3 -4"	        "-4 -1"
    //"-1 -1"	              "-1 -1"
    String[] sS = s.split(" ");
    int Max = Integer.parseInt(sS[0]);
    int Min = Integer.parseInt(sS[0]);

    for(int i = 0;i< sS.length;i++) {
      Max = (Math.max(Max,Integer.parseInt(sS[i])));
      Min = (Math.min(Min,Integer.parseInt(sS[i])));
    }
    String answer = Integer.toString(Max) + Integer.toString(Min);
  }

}
