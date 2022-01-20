package CodingTest.Programmers.Level1.SolveYet;

public class CodingTest_gymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        Boolean[] losted = new Boolean[n];
        for (int i = 0; i < n; i++) losted[i] = true;
        for (int i : lost)  losted[i - 1] = false;

        for (int i : reserve) {
            if(i == 1 && losted[i] == false) {
                losted[i] = true;
            } else if(i == n && losted[n-2]) {
                losted[n-2] = true;
            }
            else {
                if(losted[i-1] == false || losted[i+1] == false) {
                    losted[i-1] = true;
                }
            }
        }


    }
}
