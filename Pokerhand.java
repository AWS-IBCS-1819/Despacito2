import java.io.*;
import java.util.*;
import java.lang.*;

public class Pokerhand{

  public static void main(String[] args) {




    Deck uno = new Deck();
    System.out.println(uno.cards);
    System.out.println(uno.cards.size());

    Random r = new Random();
    int[] arR = r.ints(5,0,52).distinct().toArray();

    int j;
    String ph;
    ArrayList shuffle =  new ArrayList<String>();

    for(int k = 0; k < arR.length; k++){
      j = arR[k];
      ph = uno.cards.get(j);
      shuffle.add(ph);
    }
      System.out.println(shuffle);

  }
}
