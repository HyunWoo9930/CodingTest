package CodingTest.Programmers.Level1.Solved;

public class CodingTest_2016 {
    public static void main(String[] args) {
        int a = 5,b = 24;
        /*
        a 가 1월일때는 31 * a + 24일
        a 가 2월일때는 31 + 29 + 24일
        a 가 3월일때는 31 + 29 + 31 + 24일
        a 가 4월일때는 31 + 29 + 31 + 30 + 24일

         */
        int days = 0;
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i = 1;i< a ; i++) {
            if(i == 2) days += 29;
            else if(i<8) {
                if(i%2 ==1) {
                    days += 31;
                }
                else days += 30;
            }
            else{
                if(i%2 ==1) {
                    days += 30;
                }
                else days += 31;
            }
        }
        days += b;
        int answerDay = ((days-1)%7);
        String answer = day[answerDay];
        System.out.println(day[answerDay]);
        System.out.println(days);


    }
}
