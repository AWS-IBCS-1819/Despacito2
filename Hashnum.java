import java.util.*;
import java.io.*;

public class Hashnum {
  int Final;
  int random;

  public int encrypt (int a){
    int c = a % 5;
    random = c + 7;
    int b = a%random;
    int d = a * b;
    Final = d + 6;
    return Final;
  }
  public static void main(String[] args) {
    Hashnum m = new Hashnum();
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    m.encrypt(input);
  }
}
