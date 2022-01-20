package CodingTest.Programmers.Level1.KaKao.Solved;


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
        List<Double> answers = new ArrayList<>();
        // 스테이지에 도달 했으나 아직 클리어 하진 못한 플레이어의 수
        // 스테이지에 도달한 플레이어 수
        for(int i = 1;i<=N;i++) {
            int count = 0;
            int count_2 = 0;
            for(int currentStage : stages) {
                if(i <= currentStage) {
                    count++;
                    if(i == currentStage) {
                        count_2++;
                    }
                }
            }
            answers.add((double)count_2 / count * 100);
        }
        Collections.sort(answers);
        int[] answer = new int[N];
        for(int i = 0;i<answers.size();i++) {
            for(int j = 0;j<N;j++) {
                answer[i] = j;
            }
        }

    }
}
