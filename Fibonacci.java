import java.io.*;
import java.util.*;

public class Fibonacci{

  public static int Fibonacci(int n){
    if (n == 2|n == 1){
      return 1;
    }
    else{
      return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println("input a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int fib = Fibonacci(n);
    System.out.println(fib);
  }
}
