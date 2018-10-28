package P1;

/* This is the starter code. It includes questions for P1. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have exactly 3 players: player0, player1, and player2
 *  - We have exactly 3 questions, one question for each player
 *  - There is only one round and game exits at the end. 
 * 
 * Focus: 
 * 	- variables, reading input from user, and conditional if statement
 * 
 * Aim:
 * 	- Create three questions and three answers.
 *  - Get player names and add them to the game.
 *  - Ask each player a question and change his/her score based on the provided answer
 *
 * IMPORTANT: Make sure you read the "ProjectOverview.pdf" file before you work on this assignment.
 */

public class Main {				//This is your main class (executable class)
	static Game game;			//This is a global variable (can be accessed everywhere in this class)
	public static void main(String[] args) {
		game = new Game();		//This statement resets the game	
		
		//REQ1:	Modify the value of the two variables q0 and a0 to a real question and answer.
		String q0 = "question0";
		String a0 = "answer0";
		//REQ2:	Create 4 more String variables, q1, a1, q2, and a2, for two more questions and answers.
		
		//REQ3: Declare a variable name. 
		//		Ask the user about player0's name (using game.askForText(message)). Store the user input in the variable name. Add player to the game (using game.addPlayer(playerName)).
		//		Repeat the same thing for the other two players.
		
		game.setCurrentPlayer(0);
		//REQ4:	Ask player0 question q0 (using game.askForText(message)). read the answer into a String variable. 
		//		If player's input is equal to a0, then call game.correct(), otherwise call game.incorrect()

		game.setCurrentPlayer(1);
		//REQ5:	Ask player1 question q1 (using game.askForText(message)). read the answer into a String variable. 
		//		If player's input is equal to a1, then call game.correct(), otherwise call game.incorrect()
		
		game.setCurrentPlayer(2);
		//REQ6:	Ask player2 question q2 (using game.askForText(message)). Read the answer into a String variable. 
		//		If player's input is equal to a2, then call game.correct(), otherwise call game.incorrect()

		System.exit(1); 	//This statement terminates the program
	}
}
