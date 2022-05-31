package CodingTest.BeakJun.Solved.helped.Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepaintChess {

  public static boolean[][] arr;
  public static int min = 64;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    arr = new boolean[N][M];

    for(int i = 0; i < N; i++) {
      String str = br.readLine();
      for(int j = 0; j < M; j++) {
        if(str.charAt(j) == 'W') {
          arr[i][j] = true;
        } else {
          arr[i][j] = false;
        }
      }
    }

    int N_row = N - 7;
    int M_row = M - 7;

    for (int i = 0; i < N_row; i++) {
      for (int j = 0; j < M_row; j++) {
        find(i, j);
      }
    }
    System.out.println(min);
  }

  public static void find(int x, int y) {
    int end_x = x + 8;
    int end_y = y + 8;
    int count = 0;
    boolean TF = arr[x][y]; // 첫번째 칸의 색

    for(int i = x; i < end_x; i++) {
      for(int j = y; j < end_y; j++) {
        if(arr[i][j] != TF) { // 돌면서 T인데 F이거나 F 인데 T 이면,
          count++; // count를 올려줌
        }
        TF = !TF; // 다음칸을 살펴볼땐 반대 색이여야 하므로 바꿔줌.
      }
      TF = !TF; // 한칸 바로 아래도 다른 색이여야 하므로 바꿔줌.
    }
    count = Math.min(count, 64 - count);
    /*
    * 첫 번째가 만약 흰색일때 count가 구해졌다면,
    * 첫번째가 검은색으로 칠했을때의 count가 훨씬 적을 수도 있으므로,
    * count와 64 - count 중에 작은 값으로 count를 넣어줌.
    */
    min = Math.min(min, count);
    /*
    * min을 저장해놓고, 위 반복문을 돌면서 제일 작은 count값을 찾아내는 형식
    * */
  }
}
