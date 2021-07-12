package Assignment3;
import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * Swap corner words and reverse middle characters
 * 
 * Examples:
 *   Input : Hello World GFG Welcomes You
 *   Output : You semocleW GFG dlroW Hello
 */
public class Question2 {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a String: ");
		String str = inp.nextLine();
		
		String first = "", last = "";
		
		/**
		 *  capturing first word of input string into first
		 */
		int i = 0;
		char ch = str.charAt(i);
		
		while(ch != ' ') {
			first = first + ch;
			ch = str.charAt(++i);
		}
		
		/**
		 *  capturing last word of input string into last
		 */
		int j = str.length()-1;
		ch = str.charAt(j);
		
		while(ch != ' ') {
			last = ch + last;
			ch = str.charAt(--j);
		}
		
		/**
		 *  printing the string in required order
		 */
		System.out.print(last);
		for(int k = j; k >= i; k--) {
			System.out.print(str.charAt(k));
		}
		System.out.println(first);
		
		inp.close();
	}
}