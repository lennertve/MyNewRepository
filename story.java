package textAdventure;

import javax.swing.JOptionPane;

public class story {

	public void startAdventure(){
		JOptionPane.showMessageDialog(null, "Welcome to the Beach Side Story Text Adventure!");
		JOptionPane.showMessageDialog(null, "You have spent a long day swimming with your friends, and once you notice your raisin fingers, you decide to get out of the water.");
		JOptionPane.showMessageDialog(null, "Do you go straight to get your towel, turn left to walk along the shore, or turn right to walk back home?");
	}
	
	public void pickUpTowel(){
		JOptionPane.showMessageDialog(null, "You find your towel along with all of your belongings and dry off.");
		JOptionPane.showMessageDialog(null, "Uh-oh!");
		JOptionPane.showMessageDialog(null, "A dog snatches your phone and runs away.");
		JOptionPane.showMessageDialog(null, "Do you chase after the dog or let it be?");
	}
	
	public void chaseDog(){
		JOptionPane.showMessageDialog(null,"You run after the dog tirelessly.");
		JOptionPane.showMessageDialog(null,"And finally catch up to it.");
		JOptionPane.showMessageDialog(null,"The dog lets go of your phone.");
		JOptionPane.showMessageDialog(null,"And you call an uber to get home.");
		JOptionPane.showMessageDialog(null,"The end :)");
	}
	
	public void walkAlongShore(){
		JOptionPane.showMessageDialog(null, "You turn left and start walking along the shore.");
		JOptionPane.showMessageDialog(null, "You walk for miles until you find a huge sand castle big enough for you to enter.");
		JOptionPane.showMessageDialog(null, "Do you enter the sand castle or turn back?");
	}
	
	public void enterSandCastle(){
		JOptionPane.showMessageDialog(null, "You enter the mysterious sand castle");
		JOptionPane.showMessageDialog(null, "And find a glowing crystal in the middle.");
		JOptionPane.showMessageDialog(null, "You are fascinated by this lovely and suspicious object.");
		JOptionPane.showMessageDialog(null, "Do you pick it up or do you get weirded our and turn around?");
	}
	
	public void pickUpCrystal(){
		JOptionPane.showMessageDialog(null, "You pick up the purple crystal emitting bright light.");
		JOptionPane.showMessageDialog(null, "The crystal begins to glow so brihgtly that you only see white light sourrounding you");
		JOptionPane.showMessageDialog(null, "You close your eyes,");
		JOptionPane.showMessageDialog(null, "And suddenly, a jolt causes you to open your eyes.");
		JOptionPane.showMessageDialog(null, "You are transported back to the beach, so");
	}
	
	public void walkHome(){
		JOptionPane.showMessageDialog(null, "You head on home.");
		JOptionPane.showMessageDialog(null, "Once you walk back to your house, you collapse on your couch and enjoy a nice siesta.");
		JOptionPane.showMessageDialog(null, "The end :)");
	}
}
