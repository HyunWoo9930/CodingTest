package CodingTest.Level1;

public class CodingTest_Athletes_not_finish {
  public static void main(String[] ar) {
    // ["leo", "kiki", "eden"]                          	["eden", "kiki"]	                        "leo"
    // ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    // ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	              "mislav"

    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};


      for(int j = 0;j<completion.length;j++) {
        if(participant[0].equals(completion[j])); {

        }
      }
      System.out.println(participant[1]);
    }





  }

