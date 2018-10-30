package P3;

/* This file includes:
 * 	1. Solution to P2
 *  2. Questions for P3. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- 1-D arrays
 *  - for loops
 * 
 * Aim:
 * 	- Reduce code redundancy by the use of arrays and for loops 
 */

public class Main {				
	static Game game;			
	public static void main(String[] args) {
		String ans;
		do{							//This is the beginning of the game loop	
			//Reset the game
			game = new Game();			
			
			//REQ1: Modify the code below to replace these 6 variables with two String arrays: questions, and answers, each having 3 elements. e.g. questions[0] replaces q0, answers[0] replaces a0, etc.
			String q0 = "question0";
			String a0 = "answer0";
			String q1 = "question1";
			String a1 = "answer1";
			String q2 = "question2";
			String a2 = "answer2";
			//END of REQ1
			
			//REQ2:	Add code to ask user about the number of players (from 1 to 3) - use game.askForInt. Store the input in a variable numPlayers.
			
			//REQ3:	Modify the code below to ask for players' names and add them to the game in a for loop (up to numPlayers iterations).
			String name = game.askForText("What is player 0 name?");
			game.addPlayer(name);
			name = game.askForText("What is player 1 name?");
			game.addPlayer(name);
			name = game.askForText("What is player 2 name?");
			game.addPlayer(name);
			//END of REQ3
			
			//REQ4:	Modify this part to ask questions and get answers in a for loop (up to numPlayers iterations)  
			game.setCurrentPlayer(0);
			String answer = game.askForText(q0);
			if(a0.equals(answer))
				game.correct();		//display "Correct", increment score, change frame color to green
			else
				game.incorrect();	//display "incorrect", change frame color of player to red
	
			game.setCurrentPlayer(1);
			answer = game.askForText(q1);
			if(a1.equals(answer))
				game.correct();		
			else
				game.incorrect();	
			
			game.setCurrentPlayer(2);
			answer = game.askForText(q2);
			if(a2.equals(answer))
				game.correct();		
			else
				game.incorrect();	
			//END of REQ4
			
			//Do you want to play again? make sure you get valid input
			ans = game.askForText("Play again? (Y/N)"); 
			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = game.askForText("Invalid input. Play again? (Y/N)");
		}while(ans.toUpperCase().equals("Y"));	//play again if the user answers "Y" or "y"

		System.exit(1); 	//This statement terminates the program
		
	}
}
