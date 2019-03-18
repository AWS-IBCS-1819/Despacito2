import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ProfilePage extends JFrame implements ActionListener{
  public ProfilePage(String s) {
  // Frame Parameters
  setTitle(s);
  setSize(300,200); // default size is 0,0
  setLocation(10,200); // default is 0,0 (top left corner)

  // Window Listeners
  addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    } //windowClosing
  }); //addWindowLister



  }
  public void actionPerformed(ActionEvent e) {
        // code
    }

  public static void main(String[] args) {
    JFrame frame = new ProfilePage("Profile");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
