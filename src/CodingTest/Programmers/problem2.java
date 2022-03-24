package CodingTest.Programmers;

public class problem2 {

  public static void main(String[] args) {
    String phone_number = "027778888";
    int lng = phone_number.length();
    String answer = "";
    for(int i = 0;i<lng-4;i++) {
      answer += "*";
    }
    for(int i = lng-4;i<lng;i++) {
      answer += phone_number.charAt(i);
    }
    System.out.println(answer);
  }
}
