package Assignment3;
import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * program to convert the characters of given string 
 *   into hexadecimal equivalent of ASCII values 
 *   
 * Examples :
 *    Input : Geek
 *    Output : 4765656b 
 *   
 *    Input :  IronMan part 3
 *    Output : 49726f6e4d616e20706172742033
 */
public class Question1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String str = inp.nextLine();
		
		String hex = "";
		for(int i = 0; i < str.length(); i++) {
			int ascii = (int)(str.charAt(i));
			
			hex += Integer.toHexString(ascii);
		}
		
		System.out.println(hex);
		
		inp.close();
	}

}
