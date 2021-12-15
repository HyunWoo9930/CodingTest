package CodingTest.Level1.KaKao.Solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTest_Dart {

  public static void main(String[] args) {
    String DartResult = "1D2S3T*";
    Pattern pattern = Pattern.compile("([\\d]+[SDT])([*#])?");
    Matcher matcher = pattern.matcher(DartResult);
    String[] DartResults = new String[3];
    String[] DartResults_2 = new String[3];
    int i = 0;
    while(matcher.find()) {
      DartResults[i] = matcher.group(1);
      DartResults_2[i] = matcher.group(2);
      i++;
    }
    int[] result = new int[3];
    for(int j = 0;j< DartResults.length;j++) {
      for(int k = 0;k<11;k++) {
        if(DartResults[j].replaceAll("[SDT]","").equals(Integer.toString(k))) {
          result[j] = k;
          break;
        }
      }
    }

    for(int j = 0;j< DartResults.length;j++) {
      if(DartResults[j].endsWith("S")) {
        result[j] = result[j];
      }
      else if(DartResults[j].endsWith("D")) {
        result[j] = (int)Math.pow(result[j],2);
      }
      else if(DartResults[j].endsWith("T")) {
        result[j] = (int)Math.pow(result[j],3);
      }

    }
    for(int j = 0;j< DartResults_2.length;j++) {
      if (DartResults_2[j] != null) {
        if (j == 0) {
          if (DartResults_2[j].equals("*")) {
            result[j] *= 2;
          }
          else if (DartResults_2[j].equals("#")) {
            result[j] = -result[j];
          }
        }
        else if (DartResults_2[j].equals("*")) {
          result[j-1] *= 2;
          result[j] *= 2;
        } else if (DartResults_2[j].equals("#")) {
          result[j] = -result[j];
        }
      }
    }
    int answer = 0;
    for(int j = 0;j< DartResults.length;j++) {
      answer += result[j];
    }
    System.out.println(answer);

  }
}
