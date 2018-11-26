package P4;

/* This file includes:
 * 	1. Solution to P3
 *  2. Questions for P4. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have many questions. Each player may be asked more than one question.
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- Arrays and Methods
 * 
 * Aim:
 * 	- Organize code and avoid code redundancy by the use of methods
 */

public class Main {
	static Game game;

	static String[][] QA = {
			{ "What is Alberta's two letter abbreviation?", "What is British Columbia's two letter abbreviation?",
					"What is Manitoba's two letter abbreviation?", "What is New Brunswick's two letter abbreviation?",
					"What is Newfoundland and Labrador's two letter abbreviation?",
					"What is Northwest Territories's two letter abbreviation?" },
			{ "What is Alabama's two letter abbreviation?", "What is California's two letter abbreviation?",
					"What is Florida's two letter abbreviation?", "What is Arizona's two letter abbreviation?",
					"What is New York's two letter abbreviation?", "What is Oregon's two letter abbreviation?" },
			{ "What is the capital of Germany?", "What is the capital of France?", "What is the capital of Sweden?",
					"What is the capital of Italy?", "What is the capital of Greece?",
					"What is the capital of Norway?" } };
	static String[][] answers = { { "AB", "BC", "MB", "NB", "NL", "NT" }, { "AL", "CA", "FL", "AZ", "NY", "OR", },
			{ "BERlIN", "PARIS", "STOCKHOLM", "ROME", "ATHENS", "OSLO" } };

	public static void main(String[] args) {
		String ans;
		do {
			// Reset the game
			game = new Game();

			// Get number of players (from 1 to 3)
			int numPlayers = game.askForInt("How many players", 1, 3);

			// Add up to 3 players to the game
			for (int i = 0; i < numPlayers; i++) {
				String name = game.askForText("What is player " + i + " name?");
				game.addPlayer(name);
			}

			shuffleQA(QA,answers); 

			int maxRounds = QA.length * QA[0].length / numPlayers;
			int numRounds = game.askForInt("How many rounds? ", 1, maxRounds);

			System.out.println("hello");
			int counterRounds = 0;
			int catAns = 0;
			String answer = "";
			int[] counter = {0,0,0};
			for(int k = 0; k < numRounds; k++) {
				for (int i = 0; i < numPlayers; i++) {       //player
					game.setCurrentPlayer(i);																						
						catAns = game.askForInt("Choose which Category: ", 1, 3);
						while(counter[(catAns-1)] == 6) {
						catAns = game.askForInt("Empty Category, Try again: ", 1, 3);
					}
					answer = game.askForText(QA[(catAns-1)][counter[(catAns-1)]]);
					
					if (answers[catAns-1][counter[(catAns-1)]].equals(answer.toUpperCase())) {
						game.correct();																			 						
						counter[catAns-1]++;
						counterRounds++;
						if(counterRounds == numRounds)
							break;
					} else
						game.incorrect(); 
						counterRounds++;
						if(counterRounds == numRounds)
							break;
			}
			}			
				
		ans = game.askForText("Play again? (Y/N)");
			while (ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = game.askForText("Invalid input. Play again? (Y/N)");
		} while (ans.toUpperCase().equals("Y")); // play again if the user answers "Y" or "y"

		System.exit(1); // This statement terminates the program
		
	}
	public static void shuffleQA(String[][] questions, String[][] answers) {
		for(int r = 0; r < questions.length;r++) {
			for(int c = 0; c< questions[1].length;c++) {
				int randomRow = (int)(Math.random()*questions.length);
				String temp = questions[r][c];
				questions[r][c] = questions[r][randomRow];
				questions[r][randomRow] = temp;
			
				String temp1 = answers[r][c];
				answers[r][c] = answers[r][randomRow];
				answers[r][randomRow] = temp1;
			}
		}
	}
}
