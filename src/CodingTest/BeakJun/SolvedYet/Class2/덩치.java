package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class 덩치 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String[] strings = new String[n];
    for (int i = 0; i < strings.length; i++) {
      strings[i] = br.readLine();
    }
    String[] temps = new String[n];
    for (int i = 0; i < temps.length; i++) {
      temps[i] = strings[i];
    }
    System.out.println(Arrays.toString(strings));
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 몸무게가 o1 이 o2 보다 많이 나간다면,
        if (Integer.parseInt(o1.split(" ")[0]) > Integer.parseInt(o2.split(" ")[0])) {
          // 몸무게가 o1 이 더 많이 나가고 키도 o1이 더 크다면,
            return -1;
        } else if (Integer.parseInt(o1.split(" ")[0]) == Integer.parseInt(o2.split(" ")[0])) {
          if (Integer.parseInt(o1.split(" ")[1]) > Integer.parseInt(o2.split(" ")[1])) {
            return -1;
          } else {
            return 1;
          }
        } else {
          return 1;
        }
      }
    });
    System.out.println(Arrays.toString(strings));
    int[] ints = new int[n];
    int count = 1;
    ints[0] = 1;
    int temp = count;
    HashMap<String, Integer> map = new HashMap<>();
    map.put(strings[0], 1);
    for (int i = 1; i < ints.length; i++) {
      if(strings[i].equals(strings[i-1])) {
        System.out.println("equal");
        ints[i] = temp;
        count++;
      }
      // 자기보다 앞에 있는 배열의 몸무게와 키가 크다면,
      else if (Integer.parseInt(strings[i].split(" ")[0]) < Integer.parseInt(
          strings[i - 1].split(" ")[0])
          && Integer.parseInt(strings[i].split(" ")[1]) < Integer.parseInt(
          strings[i - 1].split(" ")[1])) {
        ints[i] = ++count;
        temp = count;
      } else {
        ints[i] = temp;
        count++;
      }
      map.put(strings[i], ints[i]);
    }
    for (String i : temps) {
      System.out.print(map.get(i) + " ");
    }
  }

}
