import java.io.*;
import java.util.*;

public class Deck{

  ArrayList<String> cards;

  public Deck(){
    cards =  new ArrayList<String>();
    int k = 1;
    while(k <= 1){
    for(int m = 1; m <= 11; m++){
      if(m == 1){
        cards.add("Ace Diamonds");
      }
      else if(m == 11){
        cards.add("Diamonds J");
        cards.add("Diamonds Q");
        cards.add("Diamonds K");
      }
      else{
        cards.add(m +" Diamonds");
      }
    }
    for(int m = 1; m <= 11; m++){
      if(m == 1){
        cards.add("Ace Hearts");
      }
      else if(m == 11){
        cards.add("Hearts J");
        cards.add("Hearts Q");
        cards.add("Hearts K");
      }
      else{
        cards.add(m +" Hearts");
      }
    }
    for(int m = 1; m <= 11; m++){
      if(m == 1){
        cards.add("Ace Clubs");
      }
      else if(m == 11){
        cards.add("Clubs J");
        cards.add("Clubs Q");
        cards.add("Clubs K");
      }
      else{
        cards.add(m +" Clubs");
      }
    }
    for(int m = 1; m <= 11; m++){
      if(m == 1){
        cards.add("Ace Spades");
      }
      else if(m == 11){
        cards.add("Spades J");
        cards.add("Spades Q");
        cards.add("Spades K");
      }
      else{
        cards.add(m +" Spades");
      }
    }

    k++;
    }


    }
  public static void main(String[] args) {

  }
}
