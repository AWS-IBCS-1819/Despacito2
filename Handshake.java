import java.io.*;
import java.util.*;

public class Handshake{

  public static int Handshake(int n){
    if (n == 2){
      return 1;
    }
    else{
      return n - 1 + Handshake(n-1);
    }
  }

  public static void main(String[] args) {

    int numppl = 5;
    int shakes = Handshake(numppl);
    System.out.println(shakes);

  }
}
