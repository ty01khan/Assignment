import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a 5 digit number: ");
		int num = input.nextInt();
		int x = 10000;
		
		while(num > 0) {
			int q = (int)num/x;			
			num = num%x;
			x /= 10;
			
			System.out.print(q + "   ");
		}
		System.out.println();
	}

}
