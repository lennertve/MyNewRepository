package textAdventure;

public class textAdventure {

	public static void main(String[] args) {

		userChoices choice = new userChoices ();
		story story = new story ();
		
		story.startAdventure();
		choice.askStraightOrLeftOrRight();
		
		if(choice.getRightOrLeftOrStraight().equalsIgnoreCase("straight")){
			story.pickUpTowel();
			choice.askChaseOrLet();
			
			if(choice.getChaseOrLet().equalsIgnoreCase("chase")){
				story.chaseDog();
			}
			if(choice.getChaseOrLet().equalsIgnoreCase("let")){
				story.walkHome();
			}
		}
		if(choice.getRightOrLeftOrStraight().equalsIgnoreCase("left")){
			story.walkAlongShore();
			choice.askEnterOrTurn();
			
			if(choice.getEnterOrTurn().equalsIgnoreCase("Enter")){
				story.enterSandCastle();
				choice.askPickOrTurn();
				
				if(choice.getPickOrTurn().equalsIgnoreCase("pick")){
					story.pickUpCrystal();
					story.walkHome();
				}
				if(choice.getPickOrTurn().equalsIgnoreCase("turn")){
					story.walkHome();
				}
			}
			if(choice.getEnterOrTurn().equalsIgnoreCase("Turn")){
				story.walkHome();
			}
		}
		if(choice.getRightOrLeftOrStraight().equalsIgnoreCase("right")){
			story.walkHome();
		}
		
	}

}
