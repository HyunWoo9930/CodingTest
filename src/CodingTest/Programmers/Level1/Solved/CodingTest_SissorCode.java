package CodingTest.Programmers.Level1.Solved;

public class CodingTest_SissorCode {

  public static void main(String[] args) {
    String s = "AaZz";
    int n = 25;
    String answer = "";
    String[] sArr = s.split("");

    for(int i = 0;i< sArr.length;i++) {

      int CharAt = (int)sArr[i].charAt(0) + n;
      if((int)sArr[i].charAt(0) == 32) answer += (char)(CharAt-n);
      else if((int)sArr[i].charAt(0) < 91) {
        if(CharAt > 90) {
          CharAt -= 26;
        }
        char ch = (char)CharAt;
        answer += ch;
      }
      else if((int)sArr[i].charAt(0) > 97 && (int)sArr[i].charAt(0) < 123) {
        if(CharAt > 122) {
          CharAt -= 26;
        }
        char ch = (char)CharAt;
        answer += ch;
      }
      else {
        char ch = (char) CharAt;
        answer += ch;
      }

    }
    System.out.println(answer);




















  }
}
