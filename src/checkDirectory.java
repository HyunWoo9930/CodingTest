import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class checkDirectory {

    public static void main(String[] args) {
      // Test
      while(true) {
        String choiceWithTimeout = getChoiceWithTimeout();
        System.out.println(choiceWithTimeout);
        if(choiceWithTimeout != null) {
          System.out.println("exit");
          break;
        }
      }
      System.out.println("qwer");

    }

    static String getChoiceWithTimeout() {
      Callable<String> k = () -> new Scanner(System.in).next();
      long start = System.currentTimeMillis();
      String choice = null;
      boolean valid;
      ExecutorService l = Executors.newFixedThreadPool(1);
      Future<String> g;
      g = l.submit(k);
      done: while (System.currentTimeMillis() - start < 500) {
        do {
          valid = true;
          if (g.isDone()) {
            try {
              choice = g.get();
              if (choice != null) {
                break done;
              }
            } catch (InterruptedException | ExecutionException | IllegalArgumentException e) {
              g = l.submit(k);
              valid = false;
            }
          }
        } while (!valid);
      }

      g.cancel(true);
      return choice;
    }
  }

