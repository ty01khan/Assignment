import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a five digit number: ");
		int num = inp.nextInt();
		
		while(num/10000 > 9 || num/10000 < 1) {
			System.out.print("Entered number is not a five digit number, Please enter a five digit number: ");
		    num = inp.nextInt();
		}
		
		if(num/10000 == num%10 && num/1000 - (10*(num/10000)) == (num%100)/10)
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
	}
}