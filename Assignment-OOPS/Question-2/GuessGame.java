/**
 * 
 * @author Talha Yaseen
 *
 *
 * startGame(): game is being played using this method
 */
public class GuessGame {
	
	/** 
	 * 3 players created
	 */
	Player p1, p2, p3;
	
	/**
	 *  startGame(): method to start the game
	 */
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		/**
		 *  a random target (0-9)
		 */
		int target = (int) (Math.random() * 10);
		System.out.printf("Game is about to start... Guess a number%n");
		System.out.printf("Target is to guess number %d%n%n", target);
		
		while(true) {	
			int p1g = p1.guess();
			System.out.println("Player 1 is guessed " + p1g);
			
			int p2g = p2.guess();
			System.out.println("Player 2 is guessed " + p2g);
			
			int p3g = p3.guess();
			System.out.println("Player 3 is guessed " + p3g);
			
			boolean p1Win = false, p2Win = false, p3Win = false;
			
			/**
			 *  if Player 1 guessed the target
			 */
			if(p1g == target)
				p1Win = true;
			
			/**
			 *  if Player 2 guessed the target
			 */
			if(p2g == target)
				p2Win = true;
			
			// if Player 3 guessed the target
			if(p3g == target)
				p3Win = true;
			
			/**
			 *  if winner is decided
			 */
			if(p1Win || p2Win || p3Win) {
				System.out.printf("%nSomeone is guessed the target.. Les's know who is this lucky player%n%n");
				System.out.println(p1Win ? "Player 1 is the winner" : "Player 1 is a looser");
				System.out.println(p2Win ? "Player 2 is the winner" : "Player 2 is a looser");
				System.out.println(p3Win ? "Player 3 is the winner" : "Player 3 is a looser");
				
				System.out.printf("%n------------------------ FINISHED ------------------------");
				break;
			}
			else {
				System.out.printf("%nNo one guessed the target.. Let's play again%n");
				System.out.printf("__________________________________________________________%n%n");
			}
		}
	}
}
