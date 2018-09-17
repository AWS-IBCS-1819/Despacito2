//It's the entire bee movie script
//it's not from gutenberg
//Chloe won't stop talking about her pikachu theme
//but i have too many pikachus to be excited about that


import java.util.*;
import java.io.*;

public class Conditions {

  public ArrayList<String> words;

  public Conditions() {
    this.words = new ArrayList<String>();

  }


  public void printList(ArrayList<String> printL){
    for (int i = 0; i < printL.size(); i++){
      System.out.print(printL.get(i) + ", ");
    }
    System.out.println("");
  }

  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }


  public ArrayList<String> getWords() {
    return words;
  }

  public void readNewBook(String filename) {
    File newBook = new File(filename);
    try {
      Scanner toRead = new Scanner(newBook);
      while (toRead.hasNext()) {
      String toAdd = toRead.next();
      toAdd = toAdd.replaceAll("[-+.^:,!(){}\'\"]", "");
      words.add(toAdd);
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }


  }

  public static void main(String[] args) {

    Conditions myLib = new Conditions();

    myLib.readNewBook("BeeMovie.txt");

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("The story: \n ===\n\n");
    myLib.printList(myLib.getWords());
    System.out.println("\n");

    System.out.println("Word: Bee : " + Integer.toString(myLib.getWordCount("bee") + myLib.getWordCount("Bee")));


  }

}
