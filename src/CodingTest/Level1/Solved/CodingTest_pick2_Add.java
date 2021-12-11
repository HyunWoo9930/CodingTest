package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest_pick2_Add {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        List<Integer> numList = new ArrayList<>();
        for(int i = 0;i< numbers.length-1;i++) {
            for(int j = i+1;j<numbers.length;j++) {
                numList.add(numbers[i] + numbers[j]);
            }
        }
        numList = numList.stream().distinct().collect(Collectors.toList());
        Collections.sort(numList);
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(numList);


    }
}
