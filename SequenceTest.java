package project1;
/**
 * @author wrightwj
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SequenceTest.
 */
public class SequenceTest {

	/** The 4 sequences to test all cases. */
	Sequence seq1,seq2,seq3,seq4;

	/**
	 * Creates the sequences.
	 *
	 * @throws exception when sequence is an improper string
	 */
	@Before
	public void create() throws Exception {
		//tests first Sequence constructor to create a sequence of random pegs
		seq1 = new Sequence();
		//tests second to create a sequence of pegs with specified values
		seq2 = new Sequence("RGBO");
		//creates a sequence exactly the same as the one above
		seq3 = new Sequence("RGBO");
		//creates a specified sequence of different values than those above
		seq4 = new Sequence("RGGP");
	}

	/**
	 * Compares the sequences.
	 */
	@Test
	public void compare() {
		//should be false
		System.out.println(seq1.compareSequence(seq2));
		//should be true
		System.out.println(seq2.compareSequence(seq3));
		//should be false
		System.out.println(seq3.compareSequence(seq4));
	}

	/**
	 * Tests the compare method for proper output
	 */
	@After
	public void print() {
		//should print random, capital letters every time
		System.out.println("Random: "+seq1.toString());
		//should print RGBO
		System.out.println("Should be RGBO: "+seq2.toString());
		//should also be RGBO
		System.out.println("Should be RGBO: "+seq3.toString());
		//should be RGGP
		System.out.println("Should be RGGP: "+seq4.toString());

	}
}
