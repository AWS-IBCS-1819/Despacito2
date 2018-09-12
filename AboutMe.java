// this is a class project that requires to talk to other people

import java.io.*;
import java.util.*;

public class AboutMe{

  public static String Dinosaur; // creation things
  public static boolean TRex;
  public static String OTP;
  public static String House;
  public static String Patronus;
  public static boolean Dorm;
  public static String Rmate;
  public static String Dgroup;
  public static String Food;
  public static boolean Pet;

  public AboutMe() {
    String Dinosaur = "ankylosaurus";
    boolean TRex = false;
    String OTP = "bubblegum/marceline";
    String House = "Hufflepuff";
    String Patronus = "lizard";
    boolean Dorm = false;
    String Rmate = "";
    String Dgroup = "";
    boolean Pet = true;

}// method

public static void main(String[] args) {

  AboutMe Dis = new AboutMe(); // use the method

  Scanner sc = new Scanner(System.in);


  System.out.println("We have collect info of a certain individual");
  System.out.println("Please input the things about the person you would like to know");

  System.out.println("favrite dinosaur:" + Dis.dinosaur +"/n" + "name:" + Dis.name + "/n" + "Hogwarts house:" + Dis.House);
  System.out.println("patronus:" + Dis.patronus);


  if(Dis.Dorm == true){
    System.out.println("Dorm group:" + Dis.Dgroup + "/n" + "Roommate" + Dis.Rmate);
  }

  if(Dis.Pet == true){
    System.out.println(Dis.name + " has a pet");
  }

  if(Dis.TRex == true){
    System.out.println(Dis.name + " only knows tyrannosaurus rex");
  }

  if(sc.nextLine() = "413612914"){
    System.out.println("https://www.homestuck.com/story");// nice easter egg
  }






}

}
