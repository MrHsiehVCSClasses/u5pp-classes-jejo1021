package u5pp;
/**
 *Card class
 *
 *instance variables:
 *suit
 *value
 *
 *constructors:
 *default: clubs, 2
 *decide suit: user input,2
 *custom user input, user input
 *
 *required methods:
 *make card that stores a suit and card value
 *getter methods to return suit and card value
 *mutator methods to change suit and value
 *toString() method to print The value of suit
 *.equals method to chekc if two cards are equal
 *
 *helper methods:
 *validInputSuit checks if suit input is valid
 *validInputValue checks if card value is valid
 *
 */
public class Card {
	//instance variables
	private String suit;
	private String value;
	
	//default constructor
	
	public Card() {
		suit = "clubs";
		value = "2";
	}
	
	//suit input constructor
	/**
	 * 
	 * @param newSuit: input valid suit value (clubs,hearts,diamonds,spades)
	 * makes a card with custom suit and default value
	 */
	public Card(String newSuit) {
		if(validInputSuit(newSuit)) {
			suit = newSuit.toUpperCase();
		}
		else {
			suit = "clubs";
		}
		value = "2";
	}
	
	//suit + value input constructor
	/**
	 * 
	 * @param newSuit: input valid suit value (clubs,hearts,diamonds,spades)
	 * @param value: input valid card value (1,2,3,4,5,6,7,8,9,jack,king, queen)
	 */
	public Card(String newSuit, String value) {
		
		if(validInputSuit(newSuit)) {
			suit = newSuit.toUpperCase();
		}
		else {
			suit = "clubs";
		}
		
		if (validInputValue(value)) {
			this.value = value;
		}
		else {
			this.value = "2";
		}
	}
	// value getter method
	public String getValue() {
		return value.toLowerCase();
	}
	//suit getter method
	public String getSuit() {
		return suit.toLowerCase();
	}
	
	
	public String toString() {
		return "The " + value + " of " + suit.toLowerCase();
	}
	public boolean equals(Card c) {
		String testSuit = c.getSuit();
		String testValue = c.getValue();
		if (testSuit.equalsIgnoreCase(this.suit) && testValue.equalsIgnoreCase(this.value)) {
			return true;
		}else {
			return false;
		}
	} 
	/**
	 * 
	 * @param suit: input desired suit change
	 * changes a cards suit
	 */
	public void changeSuit(String suit){
		if(validInputSuit(suit)) {
			this.suit = suit;
		}
		
	}
	/**
	 * 
	 * @param value: input desired value change
	 * changes a cards value
	 */
	public void changeValue(String value) {
		if (validInputValue(value)) {
			this.value = value;
		}
	}
	
	/**
	 * 
	 * @param input: the suit value used in a card constructor
	 * @return true: or false depending if suit used is a valid input
	 */
	private boolean validInputSuit(String input) {
		String testInput = input.toUpperCase();
		if(testInput.equals("CLUBS") || testInput.equals("DIAMONDS") || testInput.equals("HEARTS") || testInput.equals("SPADES")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * 
	 * @param input: value card made in constructor
	 * @return true: or false depending if a value is a valid input
	 */
	private boolean validInputValue(String input) {
		String testInput = input.toUpperCase();
		if(testInput.equals("2") || testInput.equals("3") || testInput.equals("10") || testInput.equals("4") || testInput.equals("5") || testInput.equals("6") || testInput.equals("7") || testInput.equals("8") || testInput.equals("9") || testInput.equals("JACK") || testInput.equals("QUEEN") || testInput.equals("KING") || testInput.equals("ACE")) {
			return true;
		}else {
			return false;
		}
		
	}

}
