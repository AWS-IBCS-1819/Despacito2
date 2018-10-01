import java.io.*;
import java.util.*;

public class Sum{

  public static void main(String[] args) {
    int Total = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the value of x");
    int x = sc.nextInt();
    System.out.println("Input the value of y");
    int y = sc.nextInt();
      for (int i = x; i <=y; i++){
      Total = Total + 1;
      System.out.println(Integer.toString(Total));
    }
  }
}
