package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumCard2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    List<Integer> nList = new ArrayList<>();
    for(String s : str.split(" ")) {
      nList.add(Integer.parseInt(s));
    }
    int m = Integer.parseInt(br.readLine());
    str = br.readLine();
    List<Integer> mList = new ArrayList<>();
    for(String s : str.split(" ")) {
      mList.add(Integer.parseInt(s));
    }
//    nList = [6, 3, 2, 10, 10, 10, -10, -10, 7, 3]
//    mList = [10, 9, -5, 2, 3, 4, 5, -10]
    Collections.sort(nList);
//    nList = [-10, -10, 2, 3, 3, 6, 7, 10, 10, 10]
    for(int i : mList) {
      bw.write(Count(nList, i) + " ");
    }
    bw.flush();
  }

  public static int Count(List<Integer> list, int value) {
    return upperBound(list,value) - lowerBound(list,value);
  }
  
  public static int lowerBound(List<Integer> array,  int value) {
    int low = 0;
    int high = array.size();
    while (low < high) {
      final int mid = low + (high - low)/2;
      if (value <= array.get(mid)) {
        high = mid;
      } else {
          low = mid + 1;
      }
    }
    return low;
  }

  public static int upperBound(List<Integer> array, int value) {
    int low = 0;
    int high = array.size();
    while (low < high) {
      final int mid = low + (high - low) / 2;
      if (value >= array.get(mid)) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}