import java.util.*;
import java.io.*;
import java.lang.*;


public class Tempdrop {

  double tem;
  double tempR;
  double wat;
  double k;


  public double calc (double Te, double Tc, double t, double Tt) {
    tem =  (Tt - Te)/(Tc - Te);
    tempR = Math.log(tem)/Math.log(Math.E);
    k = tempR/t;
    return k;
  }
  public static void main(String[] args) {
    Tempdrop td = new Tempdrop();
    Scanner sc = new Scanner(System.in);
    System.out.println("Input environment tempreture");
    double a = sc.nextDouble();
    System.out.println("Input current water temprature");
    double b = sc.nextDouble();
    System.out.println("input tempreture decreasing time(min)");
    double c = sc.nextDouble();
    System.out.println("input temprature after time(min)");
    double d = sc.nextDouble();
    double n = td.calc(a,b,c,d);

    System.out.printf("The equation is: \n" + "T(t) =" + a + "(" + b + "-" + a + ")e^(" + n + "t)\n");

  }
}
