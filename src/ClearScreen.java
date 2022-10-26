import java.io.IOException;

public class ClearScreen {

  static String[] cmd = new String[]{"clear"};

  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.print("Hello World\r");
    System.out.print("d");
  }

  public static void ClearConsole() throws IOException {
  }
}