package car;
/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: Illustrates the use of JCheckBox

    File: Ch14JCheckBoxSample2.java

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  Ch14JCheckBoxSample2 class
 *
 * <p>
 * A sample frame to illustrate the use of checkbox buttons. This sample
 * will process the ItemEvent events generated by the JCheckBox buttons.
 */
class Ch14JCheckBoxSample2 extends JFrame
                           implements ActionListener,
                                      ItemListener    {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * An array of JCheckBox objects
     */
    private JCheckBox[] checkBox;



//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14JCheckBoxSample2 frame = new Ch14JCheckBoxSample2();
        frame.setVisible(true);
    }


//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Ch14JCheckBoxSample2() {
        Container   contentPane;
        JPanel      checkPanel, okPanel;

        JButton     okButton;
        String[]    btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14JCheckBoxSample2");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place four checkboxes
        checkPanel = new JPanel(new GridLayout(0,1));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Can Program In"));
        checkBox = new JCheckBox[btnText.length];

        for (int i = 0; i < checkBox.length; i++) {
            checkBox[i] = new JCheckBox(btnText[i]);
            checkPanel.add(checkBox[i]);

            checkBox[i].addItemListener(this);
        }

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(checkPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent event) {

        StringBuffer skill = new StringBuffer("You can program in\n");

        for (int i = 0; i < checkBox.length; i++) {

            if (checkBox[i].isSelected()) {
                skill.append(checkBox[i].getText() + "\n");
            }
        }

        JOptionPane.showMessageDialog(this, skill.toString());
    }

    public void itemStateChanged(ItemEvent event) {

        JCheckBox source = (JCheckBox) event.getSource();

        String state;

        if (event.getStateChange() == ItemEvent.SELECTED) {
            state = "is selected";
        } else {
            state = "is deselected";
        }

        JOptionPane.showMessageDialog(this, "JCheckBox '" +
                                            source.getText() +
                                            "' " + state);
    }
}