import java.util.*;
import java.io.*;

/**
 * @author Talha Yaseen
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = inp.nextLine();

        Stack stack = new Stack();

        for(int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                stack.push(str.charAt(i));
        }

        String revStr = "";
        while(!stack.isEmpty()) {
            revStr += stack.pop();
        }

        if(str.equals(revStr)) {
            System.out.println("The input string is a palindrome.");
        }
        else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
