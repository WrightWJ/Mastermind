package project1;
// TODO: Auto-generated Javadoc

/**
 * The Class Peg.
 *
 * @author wrightwj
 */
public class Peg{

	/** The color. */
	//char to hold value for color of the peg
	private char color;

	/** The Constant COLORS. */
	public static final String COLORS = "RGBPYO*_ ";
	//can be called unconditionally

	/**
	 * Instantiates a new peg.
	 * pre: can be called whenever
	 * post: will create a new peg object
	 */
	public Peg() {
		//set color to random value between 0 and 6
		int charValue = (int)(Math.random()*5 + 1);
		color = COLORS.charAt(charValue);
	}

	/**
	 * Instantiates a new peg.
	 * pre: must be passed a valid color: RGBPYO
	 * post: will create a new peg with specified color.
	 * @param c the color of the peg
	 */
	public Peg(char c) {
		if (check(c)) {
			color = c;
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {	
			}
		}	
	}

	/**
	 * pre: none
	 * post: will return a valid char for color.
	 * @return the color of the peg
	 */
	public char getColor() {
		return color;
	}

	/**
	 * pre: must pass valid char
	 * post: will return true if char is inside 
	 *
	 * @param ch checks index to see if char is inside.
	 * @return true if char is found in index.
	 */
	//checks if char is in index
	private boolean check(char ch) {
		return COLORS.indexOf(ch) >-1;
	}
}