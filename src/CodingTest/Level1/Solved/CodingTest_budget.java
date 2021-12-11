package CodingTest.Level1.Solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        List<Integer> dList = Arrays.stream(d).boxed().collect(Collectors.toList());
        Collections.sort(dList);
        System.out.println(dList);
        int count = 0;
        for(int i = 0;i<dList.size();i++) {
            budget -= dList.get(i);
            if(budget >= 0) count++;
            else break;
        }
        System.out.println(count);
    }
}
