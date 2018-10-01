import java.io.*;
import java.util.*;

public class Common{
  public static void main(String[] args) {

    /*int max = 0;
    int max2 = 0;
    int max3 = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input a string of numbers");
    String x = sc.nextLine();

    for(int i = 0; i < x.length(); i++){
      String y = charAt(i);
      for(int j = 1; j < x.length() - 1; j++){
        if(x.charAt(i) == x.charAt(j)){
          max++;
        }
    }
  }*/

  int freq0 = 0;
  int freq1 = 0;
  int freq2 = 0;
  int freq3 = 0;
  int freq4 = 0;
  int freq5 = 0;
  int freq6 = 0;
  int freq7 = 0;
  int freq8 = 0;
  int freq9 = 0;

  Scanner sc = new Scanner(System.in);
  System.out.println("Input a string of numbers");
  String x = sc.nextLine();

  for(int i = 0; i < x.length(); i++){
    if(x.charAt(i) == 0){
      freq0 ++;
    }
    if(x.charAt(i) == 1){
      freq1 ++;
    }
    if(x.charAt(i) == 2){
      freq2 ++;
    }
    if(x.charAt(i) == 3){
      freq3 ++;
    }
    if(x.charAt(i) == 4){
      freq4 ++;
    }
    if(x.charAt(i) == 5){
      freq5 ++;
    }
    if(x.charAt(i) == 6){
      freq6 ++;
    }
    if(x.charAt(i) == 7){
      freq7 ++;
    }
    if(x.charAt(i) == 8){
      freq8 ++;
    }
    if(x.charAt(i) == 9){
      freq9 ++;
    }

  }
  List<Integer> list = new ArrayList<Integer>();
  list.add(freq0);
  list.add(freq1);
  list.add(freq2);
  list.add(freq3);
  list.add(freq4);
  list.add(freq5);
  list.add(freq6);
  list.add(freq7);
  list.add(freq8);
  list.add(freq9);

  int max=0;
  for (int j=0; j<(list.size());j++)
  {
      if (max<list.get(j))
      {
          max=list.get(j);
      }
  }
  System.out.println(Integer.toString(max));


  }
}
