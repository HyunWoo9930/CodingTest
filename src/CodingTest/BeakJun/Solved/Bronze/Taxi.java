package CodingTest.BeakJun.Solved.Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Taxi {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int r = Integer.parseInt(br.readLine());

    double taxi = r * r * 2;
    double uclid = Math.PI * Math.pow(r,2);
    bw.write(uclid + "\n");

    bw.write(taxi + "\n");


    bw.flush();
  }


}
