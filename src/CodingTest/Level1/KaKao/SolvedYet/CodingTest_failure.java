package CodingTest.Level1.KaKao.SolvedYet;


import java.sql.SQLOutput;
import java.util.ArrayList;

import java.util.Collections;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO
public class CodingTest_failure {
    public static void main(String[] ar) {
        Map<Float, Integer> map = new HashMap<Float, Integer>();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];

        for(int i =1;i<=N;i++) {
            int count= 0;
            int completeCount = 0;
            for(int j = 0;j< stages.length;j++) {
                if(i >= stages[j] && stages[j] > i-1) {
                    count++;
                }
                if(i <= stages[j] ) {
                    completeCount++;
                }
            }
            float failure = (float)((float)count / completeCount-i/100000.00);
            map.put(failure,i);
        }
        List<Float> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        keys.sort(Collections.reverseOrder());
        for(int i = 0;i< N;i++) {
            System.out.println(map.get(keys.get(i)));
            answer[i] = map.get(keys.get(i));
        }
    }
}
