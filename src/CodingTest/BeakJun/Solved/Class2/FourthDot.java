package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthDot {

  public static void main(String[] args) throws IOException {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int[] x = new int[3];
    int[] y = new int[3];

    for(int i = 0;i<3;i++) {
      String str = br.readLine();
      x[i] = Integer.parseInt(str.split(" ")[0]);
      y[i] = Integer.parseInt(str.split(" ")[1]);
    }
    int xdot = 0;
    int ydot = 0;
    if(x[0] == x[1]) {
      xdot = x[2];
    } else if(x[0] == x[2]) {
      xdot = x[1];
    } else if(x[1] == x[2]) {
      xdot = x[0];
    }
    if(y[0] == y[1]) {
      ydot = y[2];
    } else if(y[0] == y[2]) {
      ydot = y[1];
    } else if(y[1] == y[2]) {
      ydot = y[0];
    }

    System.out.println(xdot + " " + ydot);
  }
}
