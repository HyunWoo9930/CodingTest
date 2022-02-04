package CodingTest.Programmers.Level2.SolvedYet;

public class 괄호회전하기 {

  public static void main(String[] args) {
//    String s = "[](){}";
//    String s = "}]()[{";
//    String s = "[)(]";
//    String s = "}}}";
    String s = "([{)}]";
    int answer = 0;
    for(int i = 0;i<s.length();i++) {
      s = pushLeft(s);
      if(IsRight(s)) answer++;
    }
    System.out.println(answer);
  }
  public static String pushLeft(String s) {
    String[] sArr = s.split("");
    String result = "";
    for(int i = 1;i<sArr.length;i++) {
      result += sArr[i];
    }
    result += sArr[0];
    return result;
  }

  public static Boolean IsRight(String s) {
    if(s.length() % 2 != 0) return false;
    else if(s.startsWith(")"))
      return false;
    else if(s.startsWith("]"))
      return false;
    else if(s.startsWith("}"))
      return false;
    else if(s.endsWith("["))
      return false;
    else if(s.endsWith("{"))
      return false;
    else if(s.endsWith("("))
      return false;
    else {
      int open1 = 0;
      int open2 = 0;
      int open3 = 0;
      for(int i = 0;i<s.length();i++) {
        if(open1 < 0 || open2 < 0 || open3 < 0) {
          return false;
        } else if(s.charAt(i) == '(') {
          open1++;
        } else if(s.charAt(i) == ')') {
          open1--;
        } else if(s.charAt(i) == '{') {
          open2++;
        } else if(s.charAt(i) == '}') {
          open2--;
        } else if(s.charAt(i) == '[') {
          open3++;
        } else if(s.charAt(i) == ']') {
          open3--;
        }
      }
      if(open1 == 0 && open2 == 0 && open3 == 0) return true;
      else return false;

    }
  }
}
