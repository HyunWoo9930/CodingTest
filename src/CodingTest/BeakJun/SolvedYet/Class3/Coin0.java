package CodingTest.BeakJun.SolvedYet.Class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coin0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);
        int[] coins = new int[N];
        for(int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }






    }
}
