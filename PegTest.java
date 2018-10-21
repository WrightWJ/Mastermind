/**
 * @author wrightwj
 */
package project1;
import org.junit.Test;
// TODO: Auto-generated Javadoc

/**
 * The Class PegTest.
 */
/*
 * @author wrightwj
 */
public class PegTest {

	/**
	 * Creates the pegs to test
	 */
	@Test
	//call constructors for peg
	public void create() {
		Peg peg1 = new Peg();
		Peg peg2 = new Peg('R');
		try {
			@SuppressWarnings("unused")
			Peg peg3 = new Peg('D');
		} catch (Exception e){
			//this should never be called since the catch of the peg constructor will avoid this.
		}
		//print pegs and call getColor to test if it works.
		System.out.println(peg1.toString() + " "+ peg2.toString() + 
				"\n color of peg1 is "+peg1.getColor()+
				"\n color of peg2 is "+peg2.getColor());
	}

}
