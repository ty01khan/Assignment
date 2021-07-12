package Assignment3;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * whether first string is anagram of second or not
 */
public class Question4 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter the first string: ");
		String str1 = inp.nextLine();
				
		System.out.print("Please enter the second string: ");
		String str2 = inp.nextLine();
		
		if(str2.length() < str1.length()) {
			System.out.printf("%n%s is NOT an anagram of %s%n", str1, str2);
		}
		else {
			String s1 = str1, s2 = str2;
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			char[] cA1 = s1.toCharArray();
			char[] cA2 = s2.toCharArray();
			
			/**
			 * sorting char array
			 */
			Arrays.sort(cA1);
			Arrays.sort(cA2);
			
			int i, j = 0;
			for(i = 0; i < cA1.length; i++) {
				if(cA1[i] != cA2[i + cA2.length - cA1.length]) {
					j = 1;
					break;
				}
			}
			
			if(j == 0)
				System.out.printf("%nYes, %s is an anagram of %s%n", str1, str2);
			else
				System.out.printf("%n%s is NOT an anagram of %s%n", str1, str2);
		}
		
		inp.close();
	}

}
