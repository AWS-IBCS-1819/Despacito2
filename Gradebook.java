
import java.util.*;
import java.io.*;

public class Gradebook{

  public void readFile(String filename) {

    StringBuilder myStr = new StringBuilder();
      try {
        File randtxt = new File("grades.txt");
        Scanner sc = new Scanner(randtxt);
        while (sc.hasNext()){
          myStr.append(sc.nextLine() + "\n");
        }
    }
      catch (FileNotFoundException e){
          e.printStackTrace();
              }

      System.out.println(myStr);

  }




  public static void main(String[] args) {

    Gradebook gb = new Gradebook();
    gb.readFile("grades.txt");

  }

}
