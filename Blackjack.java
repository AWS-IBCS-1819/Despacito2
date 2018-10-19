import java.io.*;
import java.util.*;

public class Blackjack{
  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;


  public Blackjack() {
    Blackjack b = new Blackjack();
    d.shuffle();
    userHand.add(b.d.drawCard());
    userHand.add(b.d.drawCard());

    compHand.add(b.d.drawCard());
    compHand.add(b.d.drawCard());
  }


  public Integer calculateHand(ArrayList<Integer> h) {//mathy boi
    int k = 0;
    for(int i = 0; i < h.size(); i++){
      k = k + i;
    }

    return k;

  }

  public static void main(String[] args) {


  }
}
