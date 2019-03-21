import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class OutputPage extends InputPage implements ActionListener{

  JButton Back;
  JButton Output;
  JButton Add;
  JTextField t1;
  JTextField t2;
  JTextField t3;
  JLabel title1;
  JLabel title2;
  JLabel title3;
  ArrayList<Integer> HWmean;
  ArrayList<String> Sorted;
  ArrayList<Integer> Final;
  ArrayList<Integer> amount2;
  ArrayList<String> Classthis;
  ArrayList<String> Typethis;


  public OutputPage(String s) {

  super(s);
  setSize(600,400);
  setLocation(10,200);
  //setLayout(new BorderLayout());
  Back = new JButton("Back");
  add(Back);
  Back.addActionListener(this);
  Output = new JButton("Generate Homework List");
  add(Output);
  Output.addActionListener(this);
  Add = new JButton("Add");
  add(Add);
  Add.addActionListener(this);

  //add TextField
  title1 = new JLabel("Class");
  t1 = new JTextField(20);
  t1.addActionListener(this);
  add(title1);
  add(t1);
  title2 = new JLabel("Type");
  t2 = new JTextField(20);
  t2.addActionListener(this);
  add(title2);
  add(t2);
  title3 = new JLabel("Amount");
  t3 = new JTextField(20);
  t3.addActionListener(this);
  add(title3);
  add(t3);


  setVisible(true);

  // Window Listeners
  addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    } //windowClosing
  }); //addWindowLister



  }

//generate Homework List
//sort to be add
    public ArrayList<Integer> Generate(ArrayList<Integer> d){
      HWmean = new ArrayList<Integer>();
      int a = 0;
      for (Integer i = 0; i < HWtime.size(); i++) {
        a = HWtime.get(i)/HWamount.get(i);
        HWmean.add(a);
      }
      return(HWmean);


  }

  public ArrayList<String> Sort(ArrayList<Integer> a){
    Sorted = new ArrayList<String>();
    for (Integer i = 0; i < HWtime.size(); i++) {

    }
    return(Sorted);

  }

  public ArrayList<Integer> Compute(ArrayList<Integer>  b, ArrayList<Integer> c){
    Final = new ArrayList<Integer>();
    int k = 0;
    for (Integer i = 0; i < HWtime.size(); i++) {
      k = HWmean.get(i)*amount2.get(i);
      Final.add(k);
    }
    return(Final);

  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == Back){
    TimeEstimate Mainframe = new TimeEstimate("Homework Manager");
    Mainframe.setVisible(true);
    setVisible(false);}
    else if (e.getSource() == Add) {
      Classthis.add(t1.getText());
      Typethis.add(t2.getText());
      String a = t3.getText();
      int b = Integer.parseInt(a, 10);
      amount2.add(b);
    }
    else if(e.getSource() == Output){
      for (Integer i = 0; i < Classthis.size(); i++) {
        System.out.println(Classthis.get(i) + " " + Typethis.get(i) + " " + Integer.toString(Final.get(i)));

      }
    }

    }

  public static void main(String[] args) {
    /*JFrame frame3 = new OutputPage("Time Estimate");
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame3.setVisible(true);*/
  }

}
