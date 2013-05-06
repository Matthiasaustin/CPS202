package rpsls;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.Window;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Panel;

public class RPSLSGUI extends JFrame {
	public static TextField theGuess;
	protected static Object userFrame;
	protected static Object userPane;
	public static JButton history;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPSLSGUI frame = new RPSLSGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RPSLSGUI() {
		history = new JButton("History");
		theGuess = new TextField();
		JLabel instructions2 = new JLabel(
				"Press hit ENTER when you have \nfinished typing your guess");
		JLabel instructions1 = new JLabel(
				"Please enter your guess in the filed below");
		getContentPane().setLayout(null);
		// title
		setTitle("The New Rock, Paper, Scissors");
		setBounds(100, 100, 420, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// welcome statement for program
		JLabel welcomeStatement = new JLabel(
				"Welcome to Rock, Paper, Scissors, Lizard, Spock");
		welcomeStatement.setBounds(59, 28, 302, 16);

		getContentPane().setLayout(null);
		// first line of instructions for the program

		instructions1.setBounds(69, 56, 261, 16);
		getContentPane().add(instructions1);

		getContentPane().add(welcomeStatement);
		// second line of instructions for program

		instructions2.setBounds(22, 84, 371, 16);
		getContentPane().add(instructions2);

		getContentPane().setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { instructions2,
						welcomeStatement, instructions1, theGuess }));
		// field for txt to be entered

		theGuess.setText("Enter Guess Here");
		theGuess.setBounds(79, 106, 261, 22);
		getContentPane().add(theGuess);

		history.setBounds(69, 151, 117, 29);
		getContentPane().add(history);

		// theGuess listener, retrieves results and displays in window.
		theGuess.addActionListener(new Handler());
		history.addActionListener(new Handler2());
	}

	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			String guess;

			guess = (String) theGuess.getText();

			JOptionPane.showMessageDialog(theGuess, LogicSide.rpsls(guess));
		}
	}

	public class Handler2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String guess;

			guess = (String) theGuess.getText();
			JOptionPane.showMessageDialog(history, LogicSide.rpsls(guess)); // add
																			// the
																			// function
																			// we
																			// need
																			// here.
		}
	}

}
