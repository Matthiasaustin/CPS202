package utilities;

import java.awt.*;
import javax.swing.*;
public class GUILabelDemo
{
  static JFrame userFrame = new JFrame();                   // Create a frame
  static Container userPane = userFrame.getContentPane();
  static JLabel head1 = new JLabel("Prompt", JLabel.CENTER);
  static JLabel head2 = new JLabel("Input Field", JLabel.CENTER);
  static JLabel area = new JLabel("Area Code:");
  static JTextField inputField = new JTextField("999", 3);
  public static void main(String[] args)
  {
    userFrame.setSize(175, 125);                            // 175 wide, 125 long
    userFrame.setLocation(250, 150);                        // 250 right, 150 down
    userPane.setLayout(new GridLayout(3, 2));               // Grid layout manager
    userPane.add(head1);                                    // Left column heading
    userPane.add(head2);                                    // Right column heading
    userPane.add(area);                                     // Field label
    userPane.add(inputField);                               // Input field
    userFrame.setVisible(true);                             // Show on screen
  }
}
