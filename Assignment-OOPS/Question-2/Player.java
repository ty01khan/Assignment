/**
 * 
 * @author Talha Yaseen
 *
 *
 * guess(): player uses this method to guess a number in 0-9
 */
public class Player {
	
	/**
	 * 
	 * @return a random number in 0-9
	 */
	public int guess() {
		int num = (int) (Math.random() * 10);
		return num;
	}
}
