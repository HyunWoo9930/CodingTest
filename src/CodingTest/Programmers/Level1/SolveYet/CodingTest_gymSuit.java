package CodingTest.Programmers.Level1.SolveYet;

public class CodingTest_gymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        StringBuilder gymSuit = new StringBuilder("11111");
        for(int i =0;i< lost.length;i++) {
            gymSuit.setCharAt(lost[i]-1,'0');
        }
        if(reserve[0] == 1) {
            if(gymSuit.charAt(1) == 0) {
                gymSuit.setCharAt(1,'1');
            }
        }
        for(int i =1;i< reserve.length-1;i++) {
            if(gymSuit.charAt(reserve[i-1]) =='0') {
                gymSuit.setCharAt(reserve[i]-1,'1');

                break;
            }
            if(gymSuit.charAt(reserve[i+1]) =='0') {
                gymSuit.setCharAt(reserve[i]+1,'1');
                break;
            }
        }
        System.out.println(gymSuit);

    }
}
