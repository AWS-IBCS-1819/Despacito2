import java.util.*;


public class Animal {
  String species;
  String name;
  String history;


  public String setName(String m){
    name = m;
    return name;
  }

  public String setHistory(String h){
    history = h;
    return history;
  }

  public String setSpecies(String s){
    species = s;
    return species;
  }

  /*public void Rock(){
    species =  "rock";
    name = "Rocky";
    size = 1;
    history = "Used to live under a rock in bikini bottom, won a snail race once, is very old";
  }

  public void Cthulhu(){
    species =  "Cthulu";
    name = "Jimothy";
    size = 1;
    history = "Get worshipped by cults by accident, very tired and sad, give them video game and taco";
  }

  public void flamingBoi(){
    species = "Canine?";
    name = "023";
    size = 1;
    history = "The creature who's responsible for 3 incident and at least 5 death appears to be a black dog. DO NOT ENGAGE IN EYE CONTACT WITH 023 THAT'S HOW DEAD PEOPLE HAPPEN.";
  }*/

  public String getSpecies(){
    return species;
  }
  public String getName(){
    return name;
  }
  public String getHistory(){
    return history;
  }


  public static void main(String[] args) {

  }
}
