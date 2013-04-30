package rpsls;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
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

public class RPSLSGUI extends JFrame {
	public static TextField theGuess;

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
		setTitle("The New Rock, Paper, Scissors");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel welcomeStatement = new JLabel(
				"Welcome to Rock, Paper, Scissors, Lizard, Spock");
		welcomeStatement.setBounds(75, 27, 302, 16);

		JLabel instructions = new JLabel(
				"Please enter your guess in the filed below");
		instructions.setBounds(96, 70, 261, 16);

		getContentPane().setLayout(null);
		getContentPane().add(instructions);
		getContentPane().add(welcomeStatement);

		Button guessButton = new Button("Enter Guess");
		guessButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		guessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		guessButton.setBounds(96, 166, 103, 28);
		getContentPane().add(guessButton);

		Button cancelButton = new Button("Cancel");
		cancelButton.setActionCommand("Cancel");
		cancelButton.setBounds(287, 166, 70, 28);
		getContentPane().add(cancelButton);

		theGuess = new TextField();
		theGuess.setText("Enter Guess Here");
		theGuess.setBounds(96, 113, 261, 26);
		getContentPane().add(theGuess);

	}

}
