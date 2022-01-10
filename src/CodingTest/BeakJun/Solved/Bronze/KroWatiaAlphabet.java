package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KroWatiaAlphabet {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String temp = a;
    a = a.replaceAll("c=","*");
    a = a.replaceAll("c-","*");
    a = a.replaceAll("dz=","*");
    a = a.replaceAll("d-","*");
    a = a.replaceAll("lj","*");
    a = a.replaceAll("nj","*");
    a = a.replaceAll("s=","*");
    a = a.replaceAll("z=","*");
    System.out.println(a);
    System.out.println(a.length());
  }
}
