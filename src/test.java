import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class test {

  public static void main(String[] args) throws Exception {
    String responses = Files.lines(Paths.get("src/시간외근무")).collect(Collectors.joining(System.lineSeparator()));
    StringBuilder responses2 = new StringBuilder();
    for(String response : responses.split("\n")) {
      if(!response.isEmpty()) {
        responses2.append(response).append("\n");
      }
    }
    System.out.println("responses2 = " + responses2);

    for(int i = 0; i < responses2.toString().split("\n").length; i+=5) {

    }
  }
}
