package CodingTest.BeakJun.Solved.helped.Class2;

import java.util.LinkedList;
import java.util.Scanner;

public class PrinterQueue {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      LinkedList<int[]> q = new LinkedList<>();	// Queue로 활용 할 연결리스트

      for (int j = 0; j < n; j++) {
        // {초기 위치, 중요도}
        q.offer(new int[] { j, sc.nextInt() });
      }

      int count = 0;


      while(!q.isEmpty()) {
        int[] first = q.poll();
        boolean isMax = true;

        for(int j = 0; j < q.size(); j++) {

          if(first[1] < q.get(j)[1]) {
            q.offer(first);
            for(int k = 0; k < j; k++) {
              q.offer(q.poll());
            }
            isMax = false;
            break;
          }
        }

        if(isMax == false) {
          continue;
        }

        count++;
        if(first[0] == m) {
          break;
        }
      }
      sb.append(count).append("\n");
    }
    System.out.println(sb);
  }
}
