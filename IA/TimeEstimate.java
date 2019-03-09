import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class TimeEstimate extends JFrame
                          implements ActionListener, WindowListener{

  JButton Pref;
  JButton Prof;
  JButton Task;
  JButton Title;

  public void theFrame(String s){ //main interface
    setTitle(s);
		setSize(600,300);
		setLocation(10,200);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
      System.exit(0);
      }
    });

    Pref = new JButton("Preference");
    Pref.setPreferredSize(new Dimension(200, 200));
    add(Pref, BorderLayout.WEST);
    Pref.addActionListener(this);

    Prof = new JButton("Profile");
    Prof.setPreferredSize(new Dimension(200, 200));
    add(Prof, BorderLayout.CENTER);
    Prof.addActionListener(this);

    Task = new JButton("Time Estimate");
    Task.setPreferredSize(new Dimension(200, 200));
    add(Task, BorderLayout.EAST);
    Task.addActionListener(this);

    Title = new JButton("Homework Manager");
    Title.setPreferredSize(new Dimension(600, 100));
    add(Title, BorderLayout.NORTH);

  }
  public static void main(String[] args) {

  }

}
