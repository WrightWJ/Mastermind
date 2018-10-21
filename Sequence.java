package project1;

import java.util.ArrayList;

/**
 * The Class Sequence.
 *
 * @author wrightwj
 */
public class Sequence{

	//fields -- array list of pegs 
	private ArrayList<Peg> aList = new ArrayList<Peg>(); 

	/** The Constant SEQUENCE_LENGTH. */
	public static final int SEQUENCE_LENGTH = 4;
	//constructors
	/**
	 * Instantiates a new sequence.
	 */
	//creates a random sequence of pegs -- used by the computer for the player to guess
	public Sequence() {
		for (int i =0;i<SEQUENCE_LENGTH;i++){
			aList.add(new Peg());
		}
	}

	/**
	 * Instantiates a new sequence.
	 *
	 * @param s the string to create the sequence with
	 * @throws Exception is thrown if sequence is invalid
	 */
	//creates a sequence with a given string for testing purposes.
	public Sequence(String s) throws Exception {
		s.toUpperCase();
		if (s.length() !=SEQUENCE_LENGTH){
			System.out.println("Invalid string, creating random sequence.");
			s = new String("RYPO");
		}

		for (int i=0;i<SEQUENCE_LENGTH;i++){
			aList.add(new Peg(s.charAt(i)));
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//toString prints sequences
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Peg p: aList) {
			sb.append(p.getColor());
		}
		return sb.toString();
	}

	/**
	 * compares two sequence ArrayLists and will return
	 *  a string of how many nodes are in the right color, 
	 *  but wrong place or right color right place.
	 *  pre: pass this method a sequence with a length of SEQUENCE_LENGTH
	 *  post: will return how many are the correct color/wrong place and right color right place
	 *  @param seq passes a sequence to compare this object to.
	 * 	@return the string result of the compare, contains either _, B, or W to show the corresponding 
	 */
	public String compareSequence(Sequence seq) {
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i<SEQUENCE_LENGTH;i++) {
			for (int j = 0;j<SEQUENCE_LENGTH;j++) {
				if (seq.aList.get(j).getColor()==this.aList.get(i).getColor()) {
					stb.replace(i, i+1, "W");
				}
			}
			if (this.aList.get(i).getColor() == seq.aList.get(i).getColor()) {
				stb.insert(i, "B");
			} else {
				stb.append("_");
			}
		}
		stb.setLength(SEQUENCE_LENGTH);
		return stb.toString();

	}
}
