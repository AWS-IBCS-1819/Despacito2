import java.util.*;


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




  }
}
