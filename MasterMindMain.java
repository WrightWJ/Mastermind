package project1;

/**
 * The Class MasterMindMain.
 */
public class MasterMindMain {

	/**
	 * The main method.
	 *
	 * @throws Exception is thrown when sequence is invalid string
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to MasterMind!\n"
				+ "This game is played with 6 colors of pegs.\n"
				+ "(R)ed, (G)reen, (B)lue, (P)urple, (Y)ellow, (O)range\n"
				+ "The code maker creates a code consisting of 4 pegs, duplicates are allowed\n"
				+ "You must guess the 4 pegs correctly."
				+ "The code maker will respond with (B)lack when your peg is in the right place,\n"
				+ "or (W)hite when your peg is the right color, but wrong place.\n"
				+ "If the guess is correct, the game is over and you won! If not, you have 8 guesses\n"
				+ "to get it right! Or else the code maker wins.\n"
				+ "Enter your guess!");

		Board board = new Board();
		board.start();

	}
}
