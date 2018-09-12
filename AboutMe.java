// this is a class project that requires to talk to other people

import java.io.*;
import java.util.*;

public class AboutMe{

  public static String dinosaur; // creation things
  public static boolean TRex;
  public static String OTP;
  public static String House;
  public static String patronus;
  public static boolean Dorm;
  public static String Rmate;
  public static String Dgroup;
  public static String Food;
  public static boolean Pet;
  public static String name;

  public AboutMe() {
    name = "Emilie";
    dinosaur = "ankylosaurus";
    TRex = false;
    OTP = "bubblegum/marceline";
    House = "Hufflepuff";
    patronus = "lizard";
    Dorm = false;
    Rmate = "";
    Dgroup = "";
    Pet = true;

}// method

public static void main(String[] args) {

  AboutMe tis = new AboutMe(); // use the method

  System.out.println("");
  System.out.println("We have collect info of a certain individual");

  System.out.println("favrite dinosaur:" + tis.dinosaur +"\n" + "name:" + tis.name + "\n" + "Hogwarts house:" + tis.House);
  System.out.println("patronus:" + tis.patronus);


  if(tis.Dorm == true){
    System.out.println("Dorm group:" + tis.Dgroup + "\n" + "Roommate" + tis.Rmate);
  }

  if(tis.Pet == true){
    System.out.println(tis.name + " has a pet");
  }

  if(tis.TRex == true){
    System.out.println(tis.name + " only knows tyrannosaurus rex");
  }



Scanner scq = new Scanner(System.in);
System.out.println("I'm not gonna let you mess with these info, but here's a fun game:");
if(scq.nextLine() == "413612914"){
  System.out.println("https://www.homestuck.com/story");// nice easter egg
}
scq.close();
//pterodactyl
  int error = 0;
  String[] Areo = {"_","_","_","_","_","_","_","_","_","_","_"};
  System.out.println(Arrays.toString(Areo));
  System.out.println("guess the word: (letter by letter)");
  Scanner sc = new Scanner(System.in);
  if(sc.nextLine() == "p"){
    Areo[0] = "p";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "t"){
    Areo[1] = "t";
    Areo[8] = "t";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "e"){
    Areo[2] = "e";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "r"){
    Areo[3] = "r";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "o"){
    Areo[4] = "o";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "d"){
    Areo[5] = "d";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "a"){
    Areo[6] = "a";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "c"){
    Areo[7] = "c";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "y"){
    Areo[9] = "y";
    System.out.println(Arrays.toString(Areo));
  }
  else if(sc.nextLine() == "l"){
    Areo[10] = "l";
    System.out.println(Arrays.toString(Areo));
  }
  else{
    error ++;
    if (error > 6){
      System.out.println("Game Over");
    }
  }



}

}
