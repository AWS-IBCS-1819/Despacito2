import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class TimeEstimate extends JFrame implements ActionListener{

  JButton Prof;
  JButton Task;


  public TimeEstimate(String s) {
  super(s);
  setSize(600,400);
  setLocation(10,200);
  setLayout(new BorderLayout());
  Prof = new JButton("Profile");
  add(Prof, BorderLayout.LINE_START);
  Task = new JButton("Time Estimate");
  add(Task, BorderLayout.LINE_END);
  Prof.addActionListener(this);
  Task.addActionListener(this);
  setVisible(true);


  // Window Listeners
  addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    } //windowClosing
  }); //addWindowLister





  }


  public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Prof) {
          ProfilePage frame = new ProfilePage("Profile");
          frame.setVisible(true);
          setVisible(false);
        }

        else if(e.getSource() == Task) {
          OutputPage frame3 = new OutputPage("Time Estimate");
          setVisible(false);
        }
    }


  public static void main(String[] args) {

    TimeEstimate Myframe = new TimeEstimate("Homework Manager");



  }

}
