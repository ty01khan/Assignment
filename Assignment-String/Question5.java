import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * grid printing
 */
public class Question5 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter no. of rows of the grid [NOTE: should be odd only]: ");
		int n = inp.nextInt();
		
		for(int i = 0; i < n/2 + 1; i++) {
			for(int j = 0; j <= n - (2*i + 2); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (4*i + 3); j++) {
				if(j%2 == 0)
					System.out.print("-");
				else
					System.out.print(" ");
			}
			for(int j = 0; j <= n - (2*i + 2); j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for(int i = n/2 - 1; i >= 0; i--) {
			for(int j = 0; j <= n - (2*i + 2); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (4*i + 3); j++) {
				if(j%2 == 0)
					System.out.print("-");
				else
					System.out.print(" ");
			}
			for(int j = 0; j <= n - (2*i + 2); j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		inp.close();
	}

}
