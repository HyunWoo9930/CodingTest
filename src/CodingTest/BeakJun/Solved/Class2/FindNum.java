package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FindNum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int[] Narr = new int[N];
    String nStr = br.readLine();
    for(int i = 0;i<N;i++) {
      Narr[i] = Integer.parseInt(nStr.split(" ")[i]);
    }
    int M = Integer.parseInt(br.readLine());
    int[] Marr = new int[M];
    String mStr = br.readLine();
    for(int i = 0;i<N;i++) {
      Marr[i] = Integer.parseInt(mStr.split(" ")[i]);
    }
    Arrays.sort(Narr);
    for(int i = 0;i< Marr.length;i++) {
      if(BinarySearch(Narr,Marr[i]) >= 0) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }

  public static int BinarySearch(int[] arr , int key) {
    int low = 0;
    int high = arr.length-1;

    while(low <= high) {
      int mid = (high+low) / 2;

      if(key < arr[mid]) {
        high = mid -1;
      }
      else if(key > arr[mid]) {
        low = mid +1;
      }
      else {
        return mid;
      }
    }
    return -1;
  }
}
