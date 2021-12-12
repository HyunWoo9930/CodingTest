package CodingTest.Level1.KaKao.SolvedYet;
//TODO
public class CodingTest_failure {
    public static void main(String[] ar) {
        int N = 5;
        int[] stages = {2,1,2,5,2,4,3,3};
        int count= 0;
        for(int i = 0; i < stages.length;i++) {
            for(int j = 0; j < stages.length;j++) {
                if(stages[i] <= stages[j]) {
                    count++;
                    System.out.println("stages[i] : " + stages[i] + " stages[j] : " + stages[j]);
                }

            }System.out.println(count);
            count = 0;
        }
    }
}
