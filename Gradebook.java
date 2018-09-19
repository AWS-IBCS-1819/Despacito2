
import java.util.*;
import java.io.*;

public class Gradebook{

  ArrayList<Double[]> list = new ArrayList<>();

  public void readFile(String filename){
    try{
      FileReader fr = new FileReader(filename);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      while((line = bufferedReader.readLine()) != null) {
                line.convertInt();
              }

      bufferedReader.close();

    }
    catch(FileNotFoundException ex){
      System.out.println("Unable to open file '" + fileName + "'");
    }
    catch(IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

  }

  public double convertInt(String s){

  }

  public static void main(String[] args) {

  }

}
