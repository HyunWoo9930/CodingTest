package CodingTest.Programmers.Level2.KAKAO.Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 주차요금계산 {

  public static void main(String[] args) {
//    int[] fees = {180, 5000, 10, 600};
    int[] fees = {120, 0, 60, 591};
//    int[] fees = {1, 461, 1, 10};

//    String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
    String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
//    String[] records = {"00:00 1234 IN"};

    // 1. 차량 번호 조회
    List<String> CarList = new ArrayList<>();

    for(int i = 0;i<records.length;i++) {
      CarList.add(records[i].split(" ")[1]);
    }
    CarList = CarList.stream().distinct().collect(Collectors.toList());
    Collections.sort(CarList);
    int[] answer = new int[CarList.size()];
    // 2. 첫 번째 차부터 입차, 출차 계산
    for(int i = 0;i<CarList.size();i++) {
      List<String> EachCarInOut = new ArrayList<>();
      // 2-1. 각 차마다 몇시에 입차, 출차 했는지 리스트에 담아놓음
      for(int j = 0;j<records.length;j++) {
        if(records[j].contains(CarList.get(i))) {
          EachCarInOut.add(records[j]);
        }
      }
      int TotalParkingTime = 0;
      if(EachCarInOut.size() % 2 == 0) {
        for(int j = 0;j<EachCarInOut.size();j+=2) {
          String InTime = EachCarInOut.get(j).split(" ")[0];
          String OutTime = EachCarInOut.get(j+1).split(" ")[0];
          String InTimeHour = InTime.split(":")[0];
          String InTimeMin = InTime.split(":")[1];
          String OutTimeHour = OutTime.split(":")[0];
          String OutTimeMin = OutTime.split(":")[1];
          String DuringTimeHour = String.valueOf(Integer.parseInt(OutTimeHour) - Integer.parseInt(InTimeHour));
          String DuringTimeMin = String.valueOf(Integer.parseInt(OutTimeMin) - Integer.parseInt(InTimeMin));
          if(Integer.parseInt(DuringTimeMin) < 0) {
            DuringTimeHour = String.valueOf(Integer.parseInt(DuringTimeHour) - 1);
            DuringTimeMin = String.valueOf(Integer.parseInt(DuringTimeMin) + 60);
          }
          int DuringTime = Integer.parseInt(DuringTimeHour) * 60 + Integer.parseInt(DuringTimeMin);
          TotalParkingTime += DuringTime;
        }
      } else {
        for(int j = 0;j< EachCarInOut.size()-1;j+=2) {
          String InTime = EachCarInOut.get(j).split(" ")[0];
          String OutTime = EachCarInOut.get(j+1).split(" ")[0];
          String InTimeHour = InTime.split(":")[0];
          String InTimeMin = InTime.split(":")[1];
          String OutTimeHour = OutTime.split(":")[0];
          String OutTimeMin = OutTime.split(":")[1];
          String DuringTimeHour = String.valueOf(Integer.parseInt(OutTimeHour) - Integer.parseInt(InTimeHour));
          String DuringTimeMin = String.valueOf(Integer.parseInt(OutTimeMin) - Integer.parseInt(InTimeMin));
          if(Integer.parseInt(DuringTimeMin) < 0) {
            DuringTimeHour = String.valueOf(Integer.parseInt(DuringTimeHour) - 1);
            DuringTimeMin = String.valueOf(Integer.parseInt(DuringTimeMin) + 60);
          }
          int DuringTime = Integer.parseInt(DuringTimeHour) * 60 + Integer.parseInt(DuringTimeMin);
          TotalParkingTime += DuringTime;
        }
        String DontOutTimeHour = EachCarInOut.get(EachCarInOut.size()-1).split(" ")[0].split(":")[0];
        String DontOutTimeMin = EachCarInOut.get(EachCarInOut.size()-1).split(" ")[0].split(":")[1];
        String DuringTimeHour = String.valueOf(23 - Integer.parseInt(DontOutTimeHour));
        String DuringTimeMin = String.valueOf(59 - Integer.parseInt(DontOutTimeMin));
        if(Integer.parseInt(DuringTimeMin) < 0) {
          DuringTimeHour = String.valueOf(Integer.parseInt(DuringTimeHour) - 1);
          DuringTimeMin = String.valueOf(Integer.parseInt(DuringTimeMin) + 60);
        }
        int DuringTime = Integer.parseInt(DuringTimeHour) * 60 + Integer.parseInt(DuringTimeMin);
        TotalParkingTime += DuringTime;
      }
      int result = 0;
      if(TotalParkingTime <= fees[0]) {
        result = fees[1];
      } else {
        result = fees[1] + (int)Math.ceil((TotalParkingTime-fees[0]) / (double)fees[2]) * fees[3];
      }
      answer[i] = result;
    }





  }

}
