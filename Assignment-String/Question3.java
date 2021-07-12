package Assignment3;
import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * Longest Common Substring in an Array of Strings
 * 
 * Examples:
 * 	  Input : grace graceful disgraceful gracefully 
 *    Output : grace
 * 
 *    Input : sadness sad sadly
 *    Output : sad
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter length of list: ");
		int n = Integer.parseInt(inp.nextLine());
		
		System.out.printf("Please enter %d string: ", n);
		String[] strList = new String[n];
		
		String whole = "";
		
		for(int i = 0; i < n; i++) {
			strList[i] = inp.nextLine();
			whole = whole + strList[i] + "  ";
		}
		
		String first = strList[0];
	
		// result containing overall longest substring
		String result = "";
		
		for(int i = 0; i < first.length(); i++) {
			for(int j = i + 1; j <= first.length(); j++) {
				// stem contains temporary longest substring
				String stem = first.substring(i, j);
				
				// checking whether stem present in all string or not
				int k;
				for(k = 1; k < n; k++) {
					if(!strList[k].contains(stem))
						break;
				}
				
				if(k == n && result.length() <= stem.length()) {
					if(result.length() == stem.length()) {
						if(result.compareTo(stem) > 0)
							result = stem;
					}
					else {
						result = stem;
					}
				}
			}
		}
		
		System.out.println("Lowest common substring of " + whole + "is: " + result);
		inp.close();
	}

}
