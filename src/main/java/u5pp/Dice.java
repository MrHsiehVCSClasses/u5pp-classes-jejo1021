package u5pp;
/*
 * instance variables:
 * numSides - number of sides on the dice 
 * color - color of the dice
 * currentSide - current showing 
 * 
 * Constructors
 * default - 6 sides, 1st side, green
 * decide number of Sides - custom, 1st side, green
 * decide num sides and starting side
 * fully custom
 */
public class Dice {
	//instance variables
	private int numSides;
	private String color;
	private int currentSide;
	
	//CONStRUCtors
	//default constructor
	public Dice() {
		this.numSides = 6;
		this.currentSide = 1;
		this.color = "green";
	}
	/**
	 * @param newNumSides: set number of sides (int)
	 * constructor to set a custom number of sides
	 */
	public Dice(int newNumSides) {
		this.numSides = newNumSides;
		this.currentSide = 1;
		this.color = "green";
		
	}
	
	/**
	 * 
	 * @param newNumSides: set number of sides (int)
	 * @param startingSide: set starting side (int)
	 * decide number of sides and starting side
	 */
	public Dice(int newNumSides, int startingSide) {
		this.numSides = newNumSides;
		this.currentSide = startingSide;
		this.color = "green";
		if (startingSide > newNumSides) {
			this.currentSide = 1;
		}
	
	}
	/**
	 * 
	 * @param newNumSides: set number of sides (int)
	 * @param startingSide: set starting side (int)
	 * @param newColor: set dice color(String)
	 * fully custom dice
	 */
	public Dice(int newNumSides, int startingSide, String newColor) {
		this.numSides = newNumSides;
		this.currentSide = startingSide;
		this.color = newColor;
		if (startingSide > newNumSides) {
			this.currentSide = 1;
		}
		
	}
	
	//getters
	
	/**
	 * get number of sides
	 * @return number of sides (int)
	 */
	public int getSides() {
		return this.numSides;
	}
	
	//current side
	/**
	 * 
	 * @return current facing side facing up of dice
	 */
	public int getCurrentSide() {
		return currentSide;
	}
	
	//color
	/**
	 * 
	 * @return dice color
	 */
	public String getColor() {
		return this.color;
	}
	
	//prints a string containing all info about the dice 
	public String toString() {
		return "The " + color + " " + numSides + "-sided dice is showing " + currentSide;
	}
	
	//methods
	/**
	 * @param d: dice object
	 * @return true of false if the same side is facing on each dice
	 */
	public boolean equals(Dice d) {
		if(this.currentSide == d.getCurrentSide()) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * random side change
	 * @return new side facing up after roll
	 */
	public int roll() {
		this.currentSide = (int)(Math.random()*numSides + 1);
		return this.currentSide;
	}
	
	/**
	 * user controlled side change
	 * @param num enter new side to face up
	 */
	public void changeSide(int num) {
		if(num <= numSides && num >= 1) {
			this.currentSide = num;
		}
	}
	/**
	 * change dice color
	 * @param newColor: set new dice color
	 */
	public void changeColor(String newColor) {
		color = newColor;
	}
	/**
	 * change the number of sides
	 * @param num: new number of sides
	 */
	public void changeNumSides(int num) {
		this.numSides = num;
	}
	

}
