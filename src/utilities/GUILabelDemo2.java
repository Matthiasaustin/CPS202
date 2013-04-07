package utilities;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener
{  
   JFrame userFrame = new JFrame();                   // Create a frame
   Container userPane = userFrame.getContentPane();
   JLabel head1 = new JLabel("Prompt", JLabel.CENTER);
   JLabel head2 = new JLabel("Input Field", JLabel.CENTER);
   JLabel area = new JLabel("Area Code:");
   JTextField inputField = new JTextField("999", 3);
   JButton done = new JButton("Done");
   JLabel outputLabel;
  
  public GUI()
  {
    userFrame.setSize(175, 125);                      // 175 wide, 125 long
    userFrame.setLocation(250, 150);                  // 250 right, 150 down
    userPane.setLayout(new GridLayout(3, 2));         // Grid layout manager
    userPane.add(head1);                              // Left column heading
    userPane.add(head2);                              // Right column heading
    userPane.add(area);                               // Field label
    userPane.add(inputField);                         // Input field
    done.addActionListener(this);                     // Register handler
    userPane.add(done);                               // Add button
    userFrame.setVisible(true);                       // Show on screen
  }  
  
  public void actionPerformed(ActionEvent event)      // Event handler method
  {
    outputLabel = new JLabel(inputField.getText());   // Put field text in label
    userPane.add(outputLabel);                        // Add label to pane
    userPane.remove(done);                            // Take away button
    userFrame.setVisible(true);                       // Show changes
  }
}

// Here is main -- all it does is instantiate the GUI
public class GUILabelDemo2
{      
  public static void main(String[] args)
  {
    GUI gui = new GUI();
  }
}
