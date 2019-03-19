import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class TimeEstimate extends JFrame implements ActionListener{

  JButton Prof;
  JButton Pref;
  JButton Task;


  public TimeEstimate(String s) {
  super(s);
  setSize(600,400);
  setLocation(10,200);
  setLayout(new BorderLayout());
  Prof = new JButton("Profile");
  add(Prof, BorderLayout.LINE_START);
  Pref = new JButton("Preference");
  add(Pref, BorderLayout.CENTER);
  Task = new JButton("Time Estimate");
  add(Task, BorderLayout.LINE_END);
  Prof.addActionListener(this);
  Pref.addActionListener(this);
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
        else if(e.getSource() == Pref) {
          PreferencePage frame2 = new PreferencePage("Pereference");
          frame2.setVisible(true);
          setVisible(false);
        }
        else if(e.getSource() == Task) {
          OutputPage frame3 = new OutputPage("Time Estimate");
          setVisible(false);
        }
    }


  public static void main(String[] args) {

    TimeEstimate Myframe = new TimeEstimate("Homework Manager");

    /*ActionListener listener = new ActionListener();

//make frame
          JFrame frame = new TimeEstimate("Homework Manager");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//add buttons
          JButton Prof = new JButton("Profile");
          Prof.addActionListener(listener);

          Prof.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(true);
            }

        });
          JPanel panel1 = new JPanel();
          panel1.add(Prof);
          frame.add(panel1, BorderLayout.CENTER);

          JButton Pref = new JButton("Preference");
          JPanel panel2 = new JPanel();
          panel1.add(Pref);
          frame.add(panel2, BorderLayout.WEST);

          JButton Task = new JButton("Time Estimate");
          JPanel panel3 = new JPanel();
          panel3.add(Prof);
          frame.add(panel3, BorderLayout.EAST);


//frame can now be seen
          frame.setVisible(true);*/


  }

}
