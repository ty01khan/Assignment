import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter the size of square: ");
		int size = inp.nextInt();
		
		for(int i = 1; i <= size; i++) {
			if(i == 1 || i == size) {
				for(int j = 1; j <= size; j++)
				System.out.print("*");
			}
			else {
				for(int j = 1; j <= size; j++)
					if(j == 1 || j == size)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
