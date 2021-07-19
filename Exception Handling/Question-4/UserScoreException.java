import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class UserScoreException {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int score;
		String response = "Y";
		while(response.equals("Yes") || response.equals("Y")) {
			try {
				System.out.print("Please enter a test score: ");
				score = Integer.parseInt(inp.nextLine());
				try {
					if(score > 100 || score < 0) {
						throw new ScoreException("The score must be >= 0 and <= 100!");
					}
					else {
						System.out.println("That is a valid score.");
					}
				} catch(ScoreException e) {
					System.out.println(e);
				}
			} catch(NumberFormatException e) {
				System.out.println(e + ", You must enter a number for the score!");
			}
			
			System.out.printf("%nDo you want to enter another score? ");
			response = inp.nextLine();
		}
		
		inp.close();
	}

}

