import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class OutputPage extends InputPage implements ActionListener{

  JButton Back;
  JButton Output;

  public OutputPage(String s) {
  // Frame Parameters
  super(s);
  setSize(600,400);
  setLocation(10,200);
  Back = new JButton("Back");
  add(Back);
  Back.addActionListener(this);
  Output = new JButton("Generate Homework List");
  add(Output);
  Output.addActionListener(this);
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
    public ArrayList<Integer> Generate(){
      ArrayList<Integer> HWmean = new ArrayList<Integer>(); 
      int a = 0;
      for (Integer i = 0; i < HWtime.size(); i++) {
        a = HWtime.get(i)/HWamount.get(i);
        HWmean.add(a);
      }
      return(HWmean);


  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == Back){
    TimeEstimate Mainframe = new TimeEstimate("Homework Manager");
    Mainframe.setVisible(true);
    setVisible(false);}
    else if(e.getSource() == Output){
      //code
      //System.out.println();
    }

    }

  public static void main(String[] args) {
    /*JFrame frame3 = new OutputPage("Time Estimate");
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame3.setVisible(true);*/
  }

}
