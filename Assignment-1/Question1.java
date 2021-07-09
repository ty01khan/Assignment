import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 2 integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if(num1 > num2)
			System.out.println(num1 + " is larger");
		else if(num1 < num2)
			System.out.println(num2 + " is larger");
		else
			System.out.println("These numbers are equal");
	}

}
