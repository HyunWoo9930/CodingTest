package CodingTest;

import java.util.LinkedList;
import java.util.Queue;

public class num1 {

  public static void main(String[] args) throws Exception {
    int[] arrA = new int[] {4,3,2,1};
    int[] arrB = new int[] {5,4,1,2};

    boolean answer = false;

    StringBuilder arrBStr = new StringBuilder();
    for(int i : arrB) {
      arrBStr.append(String.valueOf(i));
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i :arrA) {
      queue.add(i);
    }


    for(int w = 0; w <= arrA.length; w++) {
      StringBuilder arrAStr = new StringBuilder();
      Queue<Integer> arrAQueue = MoveList(queue);
      for(int i : arrAQueue) arrAStr.append(String.valueOf(i));
      if(arrAStr.toString().equals(arrBStr.toString())) {
        answer = true;
      }

    }
    System.out.println(answer);
  }

  public static Queue<Integer> MoveList(Queue<Integer> arrAQueue) {
    int temp = arrAQueue.peek();
    arrAQueue.poll();
    arrAQueue.add(temp);
    return arrAQueue;
  }


}
