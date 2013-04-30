package rpsls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rpsls.RPSLSGUI;
public class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
	String str = "";
	
	if (event.getSource() == RPSLSGUI.theGuess)
	{
		str = event.getActionCommand();
		LogicSide.rpsls(str);
		System.out.println(LogicSide.rpsls(str));
	}
		
	}
 
}
