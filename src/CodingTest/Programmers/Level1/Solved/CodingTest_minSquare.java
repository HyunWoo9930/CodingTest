package CodingTest.Programmers.Level1.Solved;

public class CodingTest_minSquare {
    public static void main(String[] args) {
        // 가로에서 가장큰 숫자 와 세로에서 가장 큰 숫자를 구함.
        // 만약 가로에서 가장 큰 숫자가 세로에서 가장큰 숫자보다 클때,
        // 1..그 세로에서 가장 큰 숫자의 가로를 구해서, 세로에서 가장 큰 숫자보다 작으면
        // 결과는 가로에서 가장큰 숫자 * 세로에서 가장큰 숫자의 가로길이를 해주면 됌.
        // 2.. 세로에서 가장 큰 숫자보다 크면,
        // 결과는 가로에서 가장 큰 숫자 * 세로에서 가장 큰 숫자.

        int[][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
        int MaxWidth = 0,MaxVertical = 0;
        int temp = 0;
        // 가로 세로중에 큰 값을 가로에 몰아주고, 작은 값들을 세로에 몰아주는 과정
        for(int i = 0;i< sizes.length;i++) {
            if(sizes[i][0] >= sizes[i][1]) {}
            else {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        // 제일 큰 두값을 구해줌.
        for(int i = 0;i< sizes.length;i++) {
            MaxWidth = Math.max(sizes[i][0],MaxWidth);
            MaxVertical = Math.max(sizes[i][1],MaxVertical);
        }

        int answer = MaxVertical * MaxWidth;
        System.out.println(answer);

    }
}
