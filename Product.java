import java.io.*;
import java.util.*;

public class Product{

  public static void main(String[] args) {
    int product = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the value of x");
    int x = sc.nextInt();
    for (int i = 1; i <= x; i++){
      product = product * i;
      System.out.println(Integer.toString(product));
    }
  }
}
