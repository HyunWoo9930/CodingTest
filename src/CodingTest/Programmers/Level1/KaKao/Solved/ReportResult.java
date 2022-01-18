package CodingTest.Programmers.Level1.KaKao.Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReportResult {

  public static void main(String[] args) {
//    String[] id_list = {"muzi","frodo","apeach","neo"};
      String[] id_list = {"con","ryan"};
//    String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    int k = 3;

    String[] report_distinct = Arrays.stream(report).distinct().toArray(String[]::new);

    String[] reporters = new String[report_distinct.length];
    String[] reporteds = new String[report_distinct.length];
    List<String> stopped = new ArrayList<>();

    for(int i = 0;i<report_distinct.length;i++) {
      reporters[i] = report_distinct[i].split(" ")[0];
      reporteds[i] = report_distinct[i].split(" ")[1];
    }

    for(int i =0;i<id_list.length;i++) {
      int l = 0;
      for(int j = 0;j<report_distinct.length;j++) {
        if(id_list[i].equals(reporteds[j])) {
          l++;
        }
      }
      if(l >= k) {
        stopped.add(id_list[i]);
      }
    }

    List<String> results = new ArrayList<>();
    for (String value : stopped) {
      for (int i = 0;i< reporteds.length;i++) {
        if (reporteds[i].equals(value)) {
          results.add(reporters[i]);
        }
      }
    }
    int[] answer = new int[id_list.length];
    for(int i = 0;i< id_list.length;i++) {
      int l = 0;
      for(String s : results) {
        if(id_list[i].equals(s)) {
          l++;
        }
      }
      answer[i] = l;
    }
  }
}
