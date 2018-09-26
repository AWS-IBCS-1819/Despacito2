
import java.util.*;
import java.io.*;

public class Gradebook{

  public void findMean(String mean){//finds average of grades

  }

  public void findSpread(String spread){//finds number of As/Bs/Cs/Ds/Fs

  }

  public void highestGrade(String highest){
    System.out.println("Directly comparing grades does good to no one except the person with the highest grade. It is one of many parts of the flawed educational system.");
  }

  public void lowestGrade(String lowest){
    System.out.println("Directly comparing grades does good to no one except the person with the highest grade. It is one of many parts of the flawed educational system.");
  }

  public void roster(String roseter){//finds name of all students

  }



  public static void main(String[] args) {

   Gradebook gb = new Gradebook();

   StringBuilder myStr = new StringBuilder();
     try {
       File randtxt = new File("grades.txt");
       Scanner sc = new Scanner(randtxt);
       myStr.append(sc.nextLine());
       System.out.println(myStr);
   }
     catch (FileNotFoundException e){
         e.printStackTrace();
             }


}

}
