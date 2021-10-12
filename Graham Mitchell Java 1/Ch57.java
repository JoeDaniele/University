package hardway; // package 

class Card { // new function/method
	int value; // values within the class
	String suit;
	String name;

	public String toString() { // method inside function, using string
		return name + " of " + suit; // variables within toString(), print name&suit
	}
}

public class Ch57 { // file title //added exception
	public static void main(String[] args) throws Exception { // main method requiring an array of args
		Card[] deck = buildDeck(); // card function becomes array?
		// displayDeck(deck); // prints all cards in deck

		int chosen = (int) (Math.random() * deck.length); // calculation for chosen int
		Card picked = deck[chosen]; // Card picked is chosen from inside the deck array
		// e.g. card picked (value/suit/name) is taken from deck array(Line31) and
		// specified by chosen
		System.out.println("You picked a " + picked + " out of the deck,");
		System.out.println("worth " + picked.value + " points in Blackjack.");
	}

	public static Card[] buildDeck() { // function BuildDeck
		String[] suits = { // array of suits
				"clubs", "diamonds", "hearts", "spades" };
		String[] names = { // array of names
				"Zero", "ONE", "two", "three", "four", "five", "six", 
				"seven", "eight", "nine", "ten", "Jack", "Queen",
				"King", "Ace" };

		int i = 0; // i = 0;
		Card[] deck = new Card[52]; // array of cards, 52 in the deck

		for (String s : suits) { // for each string inside suits array
			for (int v = 2; v <= 14; v++) { // for when 2 is <= 14, increment
				Card c = new Card(); // Card function set to c

				c.suit = s; // suit value in card func = s
				c.name = names[v]; // name value in card func = value in array of names
				if (v == 14) // if v = 14
					c.value = 11; // cards value is 11
				else if (v > 10) // if v is greater than 10
					c.value = 10; // cards value is 10
				else // otherwise
					c.value = v; // cards value is equal to value found on line 32

				deck[i] = c; // array of deck = card function
				i++; // “skip the rest of the lines of code in the body of the loop
						// and just go back up to the top for the next iteration.”
						// e.g. same as "continue;" imo: "reiterate"
			}
		}
		return deck; // returns to deck value and repeats for loop from line 29 ?
	}

	public static void displayDeck(Card[] deck) { // function commented out
		for (Card c : deck) // for each card in array deck
			System.out.println(c.value + "\t" + c); // print the cards value and
	}

	public static void shuffleDeck(String Card[]) {
		for (int i = 0; i < Card.length; i++) {
			
		}
	}
}
/*
 * Study Drill
 * 
 * Add a function called shuffleDeck(). It should take in an array of cards as a
 * parameter and return nothing (void). One way to shuffle is to choose two
 * random numbers from 0-51 and “swap” the cards in those slots. Then put that
 * code in a loop that repeats 1000 times or so. This is a bit tricky to get
 * right.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
