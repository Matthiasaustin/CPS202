package utilities;

import java.awt.event.*;   // Remember to import the event sub-package of java.awt
import javax.swing.*;
class ButtonHandler implements ActionListener
{
  public void actionPerformed(ActionEvent event) // Event handler method
  {
    JLabel outputLabel =                         // Make label from field value
      new JLabel(GUILabelDemo.inputField.getText());
    GUILabelDemo.userPane.add(outputLabel);      // Put label in pane
    GUILabelDemo.userFrame.setVisible(true);     // Show change on screen
  }
}                                                
