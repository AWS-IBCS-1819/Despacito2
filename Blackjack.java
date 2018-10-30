import java.io.*;
import java.util.*;

public class Blackjack extends Card{
  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;


  public Blackjack() {//initiate the game
    Blackjack b = new Blackjack();
    d.shuffle();

    if(compHand == null|userHand == null){
      userHand.add(b.d.drawCard());
      userHand.add(b.d.drawCard());

      compHand.add(b.d.drawCard());
      compHand.add(b.d.drawCard());
    }
  }

  public String cardName(ArrayList<Card> d){//print the cards
    String name = " ";
    for (int i = 0; i < d.size(); i++){
      d.get(i).getName();
      name = name + d.get(i).getName();
    }
    return name;
  }





  public Integer calculateHand(ArrayList<Card> h) {//do the math
    Card c;
    int k = 0;
    for(int i = 0; i < h.size(); i++){
      k = k + h.get(i).getValue();
    }

    return k;

  }

  public static void main(String[] args) {
    Blackjack b = new Blackjack();
    Boolean game = true;
    Scanner sc = new Scanner(System.in);
    while(game = true){//just keep running til its false
      System.out.println (" 1.Hit\n 2.Stay\n 3.Quit");
      if(sc.nextLine() == "1"){
        userHand.add(b.d.drawCard());
        compHand.add(b.d.drawCard());
        if(b.calculateHand(b.userHand) < 21){
          System.out.println("Sum: " + Integer.toString(b.calculateHand(b.userHand)) + "Cards: " + b.cardName(b.userHand));
          System.out.println("Sum: " + Integer.toString(b.calculateHand(b.compHand)) + "Cards: " + b.cardName(b.compHand));
        }
        else if(b.calculateHand(b.userHand) > 21){
          System.out.println("Player's sum: " + Integer.toString(b.calculateHand(b.userHand)) + "Player's cards: " + b.cardName(b.userHand));
          System.out.println("Dealer's sum: " + Integer.toString(b.calculateHand(b.compHand)) + "Dealer's cards: " + b.cardName(b.compHand));
          System.out.println("WASTED");
          game = false;
        }
        else if((b.calculateHand(b.userHand) == 21 )| (b.calculateHand(b.compHand) > 21) ){
          System.out.println("Player's sum: " + Integer.toString(b.calculateHand(b.userHand)) + "Player's cards: " + b.cardName(b.userHand));
          System.out.println("Dealer's sum: " + Integer.toString(b.calculateHand(b.compHand)) + "Dealer's cards: " + b.cardName(b.compHand));
          System.out.println("VICTORY");
          game = false;
        }
        }
      else if(sc.nextLine() == "2"){
        if(b.calculateHand(b.compHand) <= 16){
          compHand.add(b.d.drawCard());
          if(b.calculateHand(b.compHand) > 21 ){
            System.out.println("Player's sum: " + Integer.toString(b.calculateHand(b.userHand)) + "Player's cards: " + b.cardName(b.userHand));
            System.out.println("Dealer's sum: " + Integer.toString(b.calculateHand(b.compHand)) + "Dealer's cards: " + b.cardName(b.compHand));
            System.out.println("VICTORY");
            game = false;
          }
          else{
            System.out.println("Dealer's sum: " + " " + Integer.toString(b.calculateHand(b.compHand)) + "Dealer's cards: " + b.cardName(b.compHand));
          }
        }

      }
      else{
        game = false;
      }
    }


  }
}
