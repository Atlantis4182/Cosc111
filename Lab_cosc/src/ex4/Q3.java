package ex4;

public class Q3 {
	public static void main(String[] args) {
		
		
		int card = (int)(Math.random()*52); 
		
		
		
		System.out.print("The card you picked is ");
		
		int rank = card%13;
		
		switch(rank) {
		case 1: System.out.print("Ace"); break;
		case 2: System.out.print(rank); break;
		case 3: System.out.print(rank); break;
		case 4: System.out.print(rank); break;
		case 5: System.out.print(rank); break;
		case 6: System.out.print(rank); break;
		case 7: System.out.print(rank); break;
		case 8: System.out.print(rank); break;
		case 9: System.out.print(rank); break;
		case 10: System.out.print(rank); break;
		case 11: System.out.print("Jack"); break;
		case 12: System.out.print("Queen"); break;
		case 13: System.out.print("King"); 
		}

		int suit = card/13 + 1;

		switch(suit) {
		case 1: System.out.print(" of Spades!"); break;
		case 2: System.out.print(" of Hearts!"); break;
		case 3: System.out.print(" of Clubs!"); break;
		case 4: System.out.print(" of Diamonds!"); break;
		}
		
	}
}
