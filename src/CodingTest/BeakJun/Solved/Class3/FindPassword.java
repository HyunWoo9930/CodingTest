package CodingTest.BeakJun.Solved.Class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class FindPassword {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);
        HashMap<String, String> passwordMap = new HashMap<>();
        for(int i =0; i < N; i++) {
            str = br.readLine();
            passwordMap.put(str.split(" ")[0], str.split(" ")[1]);
        }
        for(int i = 0; i < M; i++) {
            str = br.readLine();
            bw.write(passwordMap.get(str) + "\n");
        }

        bw.flush();
    }
}
