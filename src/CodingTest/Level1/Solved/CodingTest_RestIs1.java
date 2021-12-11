package CodingTest.Level1.Solved;

public class CodingTest_RestIs1 {
    public static void main(String[] args) {
        int n =12;
        int answer = 0;
        for(int i=n;i>0;i--) {
            if(n%i == 1) answer = Math.min(i,n-1);
        }
        System.out.println(answer);


    }
}
