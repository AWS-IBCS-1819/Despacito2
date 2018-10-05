import java.io.*;
import java.util.*;

public class ReverseString{

  public static String Reverse(String s){

    int length = s.length() - 1;
    StringBuilder sb = new StringBuilder();
    if((s==null)|(s. length() <= 1)){
      return s;
    }
    else{
      char c = s.charAt(0);
      return Reverse(s.substring(1)) + c;
    }



  }

  public static void main(String[] args) {

    String sample = "This is so sad Alexa play Despacito";
    //while loop solution
    int i = sample.length()-1;
    int j = 0;
    while(j <=  i){
      System.out.print(sample.charAt(i));
      i--;
    }

    //recursive
    String revsamp = Reverse(sample);
    System.out.println(revsamp);

  }
}
