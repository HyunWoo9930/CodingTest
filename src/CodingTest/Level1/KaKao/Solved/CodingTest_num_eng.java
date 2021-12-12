package CodingTest.Level1.KaKao.Solved;

public class CodingTest_num_eng {

  public static void main(String[] ar) {
    // input                                                  output
    //
    // one4seveneight                                         1478
    // 23four5six7                                            234567
    // 2three45sixseven                                       234567
    // 123                                                    123

    String input = "23four5six7";
    String[] numArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine"};
    for(int i = 0;i< numArray.length;i++) {
      if(input.contains(numArray[i])){
        input = input.replace(numArray[i],Integer.toString(i));
      }
    }
    Integer.parseInt(input);
    System.out.println(input);
  }


}


