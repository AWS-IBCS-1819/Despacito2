import java.io.*;
import java.util.*;

public class Blackjack extends Card{
  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;


  public Blackjack() {
    Blackjack b = new Blackjack();
    d.shuffle();

    if(compHand == null|userHand == null){
      userHand.add(b.d.drawCard());
      userHand.add(b.d.drawCard());

      compHand.add(b.d.drawCard());
      compHand.add(b.d.drawCard());
    }
  }





  public Integer calculateHand(ArrayList<Card> h) {
    Card c;
    int k = 0;
    for(int i = 0; i < h.size(); i++){
      k = k + h.get(i).getValue();
    }

    return k;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Play Blackjack?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    if(sc.nextInt() == 1){

    }


  }
}
