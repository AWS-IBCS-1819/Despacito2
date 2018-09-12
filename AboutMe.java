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
    String name = "Emilie";
    String dinosaur = "ankylosaurus";
    boolean TRex = false;
    String OTP = "bubblegum/marceline";
    String House = "Hufflepuff";
    String patronus = "lizard";
    boolean Dorm = false;
    String Rmate = "";
    String Dgroup = "";
    boolean Pet = true;

}// method

public static void main(String[] args) {

  AboutMe tis = new AboutMe(); // use the method

  Scanner sc = new Scanner(System.in);


  System.out.println("We have collect info of a certain individual");
  System.out.println("Please input the things about the person you would like to know");

  System.out.println("favrite dinosaur:" + tis.dinosaur +"\n" + "name:" + tis.name + "\n" + "Hogwarts house:" + tis.House);
  System.out.println("patronus:" + tis.patronus);

  if(sc.nextLine() == "413612914"){
    System.out.println("https://www.homestuck.com/story");// nice easter egg
  }

  if(tis.Dorm == true){
    System.out.println("Dorm group:" + tis.Dgroup + "\n" + "Roommate" + tis.Rmate);
  }

  if(tis.Pet == true){
    System.out.println(tis.name + " has a pet");
  }

  if(tis.TRex == true){
    System.out.println(tis.name + " only knows tyrannosaurus rex");
  }

  /*int error = 0;
  String[] Areo;
  Areo = new String[11];
  System.out.println("_ _ _ _ _ _ _ _ _ _ _");
  System.out.println("guess the word: (letter by letter)");
  if(sc.nextLine == "p"){
    Areo[0] = "p";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "t"){
    Areo[1] = "t";
    Areo[8] = "t";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "e"){
    Areo[2] = "e";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "r"){
    Areo[3] = "r";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "o"){
    Areo[4] = "o";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "d"){
    Areo[5] = "d";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "a"){
    Areo[6] = "a";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "c"){
    Areo[7] = "c";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "y"){
    Areo[9] = "y";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else if(sc.nextLine == "l"){
    Areo[10] = "l";
    if(Arrays.toString(Areo) == "pterodactyl"){
      break;
    }
  }
  else{
    error ++;
    if (error > 6){
      System.out.println("Game Over");
      break;
    }
  }*/



}

}
