package CodingTest.BeakJun.Solved.Class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int score = sc.nextInt();
    int[] cards = new int[a];
    for(int i = 0;i< cards.length;i++) {
      cards[i] = sc.nextInt();
    }
    int min = 21;
    List<Integer> cardList = new ArrayList<>();
    for(int i = 0;i<cards.length-2;i++) {
      for(int j = i+1;j<cards.length-1;j++) {
        for(int k = j+1;k<cards.length;k++) {
          if(cards[i]+cards[j]+cards[k] <= score) {
            cardList.add(cards[i]+cards[j]+cards[k]);
          }
        }
      }
    }
    Collections.sort(cardList);
    System.out.println(cardList.get(cardList.size()-1));
  }
}
