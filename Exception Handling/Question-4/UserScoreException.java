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
		
		while(true) {
			try {
				System.out.print("Please enter a test score: ");
				score = Integer.parseInt(inp.nextLine());
				try {
					if(score > 100 || score < 0) {
						String msg = "The score must be >= 100 and <= 100!";
						throw new ScoreException(msg);
					}
					else {
						System.out.println("That is a valid score.");
					}
				} catch(ScoreException e) {
					System.out.println(e);
				}
			} catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.printf("You must enter a number for the score!%n");
			}
			
			System.out.printf("%nDo you want to enter another score? ");
			String response = inp.nextLine();
			if(!(response.equals("Yes")) && !(response.equals("Y"))) {
				break;
			}
		}
		
		inp.close();
	}

}
