import java.util.*;
import java.lang.*;


public class Zoo {



  public static void main(String[] args) {
    Zoo z = new Zoo();


    ArrayList<Enclosure> en = new ArrayList<Enclosure>();
    Enclosure Sea = new Enclosure();
    Sea.setSize(27);
    Sea.setDescription("Salt water");
    en.add(Sea);
    Enclosure Room023 = new Enclosure();
    Room023.setSize(55);
    Room023.setDescription("an intersection of two corridoors, each direction extends to at least 3 meters");
    en.add(Room023);
    Enclosure Room2662 = new Enclosure();
    Room2662.setSize(404);
    Room2662.setDescription("an enlarged humanoid containment unit with standard safety measures");
    en.add(Room2662);


    ArrayList<Animal> an = new ArrayList<Animal>();
    Animal Rock = new Animal();
    Rock.setName("Rocky");
    Rock.setSpecies("Rock");
    Rock.setHistory("Used to live under a rock in bikini bottom, won a snail race once, is very old");

    Animal flamingBoi = new Animal();
    flamingBoi.setName("023");
    flamingBoi.setSpecies("Canine?");
    flamingBoi.setHistory("The creature who's responsible for 3 incident and at least 5 death appears to be a black dog. DO NOT ENGAGE IN EYE CONTACT WITH 023 THAT'S HOW DEAD PEOPLE HAPPEN.");

    Animal Cthulhu = new Animal();
    Cthulhu.setName("Jimothy");
    Cthulhu.setSpecies("Cthulhu");
    Cthulhu.setHistory("Get worshipped by cults unwillingly, very tired and sad, give them video game and taco");


    HashMap<Animal,Enclosure> ae = new HashMap<Animal,Enclosure>();
    ae.put(Rock, Sea);
    ae.put(flamingBoi, Room023);
    ae.put(Cthulhu, Room2662);

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the zoo, sometimes people die here");
    System.out.println("We have like, three things here");
    System.out.println("Two of them can kill you, ther other one is a rock");
    System.out.println("You wanna hear about the rock? Y/N");
    if(sc.nextLine().equals("Y")){
      System.out.println("The name of this rock is " +  Rock.getName());
      System.out.println(Rock.getHistory());
      System.out.println("No sea star were harmed in the process of acquiring this rock, he kinda forget about it completely");
      System.out.println("The Enclosure of Rock is " + ae.get(Rock).getDescription());
    }
    else{
      System.out.println("I see you prefer more lethel things");
      System.out.println("Are you a dog person or a octopus enthusiast?");
      if(sc.nextLine().equals("dog person")) {
        System.out.println("We call it " + flamingBoi.getName());
        System.out.println(flamingBoi.getHistory());
        System.out.println("The Enclosure of " + flamingBoi.getName() + " is " + ae.get(flamingBoi).getDescription());
        System.out.println("Please don't look at it in the eyes");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("You just looked didn't you");
      }
      else {
        System.out.println("Do you happended to dislike octopus? Y/N");
        if(sc.nextLine().equals("N")) {
          System.out.println("This is the eldrich God " + Cthulhu.getName());
          System.out.println(Cthulhu.getHistory());
          System.out.println("The Enclosure of " + Cthulhu.getName() + " is " + ae.get(Cthulhu).getDescription());
          System.out.println("When you look into the eldrich god, the eldrich god looks into you");
          System.out.println("The eldrich god, Jimothy, just said you should get a life");
          System.out.println("Why are you booing him he's right");
        }
        else {
          System.out.println("Why are you even here");
          System.out.println("Anyway here's a link to some nice plants");
          System.out.println("https://youtu.be/dQw4w9WgXcQ?t=85");
        }
      }
    }




  }
}
