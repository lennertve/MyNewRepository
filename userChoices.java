package textAdventure;

import javax.swing.JOptionPane;

public class userChoices {

	String input = "";
	
	public void askStraightOrLeftOrRight () {
		input = JOptionPane.showInputDialog("Choose your destiny. Enter straight, left, or right");
	}
	
	public void askChaseOrLet () {
		input = JOptionPane.showInputDialog("Choose your destiny. Enter chase or let");
	}
	
	public void askEnterOrTurn(){
		input = JOptionPane.showInputDialog("Choose your destiny. Enter enter or turn");
	}
	
	public void askPickOrTurn(){
		input = JOptionPane.showInputDialog("Choose your destiny. Enter pick or turn");
	}
	
	public String getRightOrLeftOrStraight (){
		return input;
	}
	
	public String getChaseOrLet (){
		return input;
	}
	
	public String getEnterOrTurn(){
		return input;
	}
	
	public String getPickOrTurn(){
		return input;
	}
}
