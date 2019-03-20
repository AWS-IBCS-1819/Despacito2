import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;


public class InputPage extends JFrame implements ActionListener{

  JTextField c1;
  JTextField c2;
  JTextField c3;
  JTextField c4;
  JButton s1;
  String hwClass;
  String input;
  Double Time;
  int Amount;
  GroupLayout layout;
  JLabel myLabel;
  JLabel myLabel2;
  JLabel myLabel3;
  JLabel myLabel4;
  public ArrayList<String> HWclass;
  public ArrayList<String> HWtype;
  public ArrayList<Integer> HWtime;
  public ArrayList<Integer> HWamount;
  //public ArrayList<Integer> HWmean;

  public InputPage (String s) {
    super(s);
    setSize(600,400);
    setLocation(10,200);
    layout = new GroupLayout(this.getContentPane());
    getContentPane().setLayout(layout);

    myLabel = new JLabel("Class");
    c1 = new JTextField(20);
    c1.addActionListener(this);
    add(myLabel);
    add(c1);
    myLabel = new JLabel("Homework");
    c2 = new JTextField(20);
    c2.addActionListener(this);
    add(myLabel);
    add(c2);
    myLabel = new JLabel("Total time");
    c3 = new JTextField(20);
    c3.addActionListener(this);
    add(myLabel);
    add(c3);
    myLabel = new JLabel("Problem Amount");
    c4 = new JTextField(20);
    c4.addActionListener(this);
    add(myLabel);
    add(c4);

    s1 = new JButton("Submit");
    add(s1);
    s1.addActionListener(this);

    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);


    setVisible(true);

    // Window Listeners
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
      System.exit(0);
      } //windowClosing
    }); //addWindowLister

  }

  public void actionPerformed(ActionEvent ae){

      HWclass.add(c1.getText());


      HWtype.add(c2.getText());


      String a = c3.getText();
      int b = Integer.parseInt(a, 10);
      HWtime.add(b);


      String c = c4.getText();
      int d = Integer.parseInt(c, 10);
      HWamount.add(d);


  }
  public static void main(String[] args) {

  }



}
