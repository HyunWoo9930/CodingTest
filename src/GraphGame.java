import static java.lang.Math.round;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GraphGame {

  static Scanner sc = new Scanner(System.in);
  static int totalMoney = 0;
  static int borrowMoney = 0;
  static Random random = new Random();
  static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  static PrintStream printStream = new PrintStream(outputStream);

  public static void main(String[] args) throws Exception {
    System.out.println("돈을 얼만큼 넣으시겠습니까?");
    int money = sc.nextInt();
    totalMoney += money;
    borrowMoney += money;
    while (true) {
      System.out.println("어느 게임을 하시겠습니까? (게임 번호를 입력해주세요.) || 0.게임 그만하기 1. 홀짝 2. 그래프 게임");
      int gameNum = sc.nextInt();
      if (gameNum == 0) {
        System.out.println("총 딴 금액 : " + totalMoney + " 원");
        System.out.println("총 빌린 금액 : " + borrowMoney + " 원");
        System.out.println("-----------------------------------");
        System.out.println("총 따신 금액 : " + (totalMoney - borrowMoney) + " 원");
        break;
      } else if (gameNum == 1) {
        OddEvenNum();
      } else if (gameNum == 2) {
        GraphGame();
      }
    }
  }

  public static void OddEvenNum() {
    int count = 0;
    while(true) {
      System.out.println("현재 시도 횟수 : " + ++count + " 회");
      if(totalMoney <= 0) {
        System.out.println("당신은 거지가 되었습니다. ㅋㅋㄹㅃㅃ");
        System.out.println("돈을 더 넣으시겠습니까? [y/n]");
        if(sc.next().equals("y")) {
          System.out.println("얼마를 더 넣으시겠습니까?");
          int i = sc.nextInt();
          totalMoney += i;
          borrowMoney += i;
        } else {
          break;
        }
      }
      System.out.println("얼마를 배팅하시겠습니까? 현재 잔약 : " + totalMoney + "원");
      int i = sc.nextInt();
      if(totalMoney < i) {
        System.out.println("돈이 충분하지 않습니다.");
        continue;
      }
      totalMoney -= i;
      totalMoney += OddEvenNum(i);
      System.out.println("더 하시겠습니까? [y/n]");
      String s = sc.next();
      if(s.equals("N") || s.equals("n") || s.equals("no")) break;
    }
    System.out.println("총 남은 금액은 : " + totalMoney + " 입니다.");
  }

  public static int OddEvenNum(int Score) {
    Scanner sc = new Scanner(System.in);

    String i = random.nextInt(100) % 2 == 0? "짝수":"홀수";
    System.out.println("[홀수] [짝수] 중 한개를 골라주세요.");
    String s = sc.nextLine();
    if(s.equals("홀수") || s.equals("짝수")) {
      if (s.equals(i)) {
        System.out.println("맞았습니다.");
        return Score * 2;
      } else {
        System.out.println("틀렸습니다.");
        return 0;
      }
    } else {
      System.out.println("다시 입력해주세요.");
      return OddEvenNum(Score);
    }
  }

  static int GraphGame() throws Exception {
    double v = 1 + round(random.nextInt(2000)) / 100.0;

    System.out.println("v = " + v);
    System.out.println("얼마를 배팅하시겠습니까? 현재 잔약 : " + totalMoney + "원");
    int money = sc.nextInt();
    double rate = 1;
    while (rate < v) {
      double v1 = round(rate * 100) / 100.0;
      System.out.print(v1 + "\r");
      rate += 0.1;
      Thread.sleep(50);
      String choiceWithTimeout = getChoiceWithTimeout();
      Thread.sleep(50);
      System.out.println(choiceWithTimeout);
      if (choiceWithTimeout != null) {
        break;
      }
      Thread.sleep(50);
    }
    System.out.println("그래프 종료! 최종 비율 : " + round(rate * 100) / 100.0 + "%");
    Thread.sleep(5000);
    return 0;
  }

  static String getChoiceWithTimeout() {
    Callable<String> k = () -> new Scanner(System.in).next();
    long start = System.currentTimeMillis();
    String choice = null;
    boolean valid;
    ExecutorService l = Executors.newFixedThreadPool(1);
    Future<String> g;
    g = l.submit(k);
    done:
    while (System.currentTimeMillis() - start < 1000) {
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

  static String test() {
    long start = System.currentTimeMillis();
    while (System.currentTimeMillis() - start < 15 * 1000) {

    }

    return null;
  }

}
