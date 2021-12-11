package CodingTest.Level1.Solved;

import java.util.ArrayList;
import java.util.List;

public class CodingTest_meaureNum_add {
    public static void main(String[] args) {
        int left = 24,right = 27;
        int count = 0;
        int sum = 0;
        for(int i = left;i<=right;i++) {
            for(int j = 1;j<= i;j++) {
                if(i % j == 0) count++;
            }
            if(count % 2 == 0) sum += i;
            else sum -= i;
            count = 0;
        }
        System.out.println(sum);
    }
}
