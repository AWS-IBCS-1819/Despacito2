import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class PreferencePage extends JFrame implements ActionListener{

  JButton Back;
  JTextField a1;
  JComboBox b1;
  JComboBox b2;

  public PreferencePage(String s) {
  // Frame Parameters
  super(s);
  setSize(600,400); // default size is 0,0
  setLocation(10,200); // default is 0,0 (top left corner)
  Back = new JButton("Back");
  add(Back);
  Back.addActionListener(this);
  setVisible(true);


  addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }
  });



  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == Back){
    TimeEstimate Mainframe = new TimeEstimate("Homework Manager");
    Mainframe.setVisible(true);
    setVisible(false);}
    }


  public static void main(String[] args) {
    /*JFrame frame2 = new PreferencePage("Pereference");
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setVisible(true);*/
  }

}
