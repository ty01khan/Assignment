import java.io.*;
import java.util.Scanner;

/**
 * @author Talha Yaseen
 *
 * 2: {'A', 'B', 'C'},
 * 3: {'D', 'E', 'F'},
 * 4: {'G', 'H', 'I'},
 * 5: {'J', 'K', 'L'},
 * 6: {'M', 'N', 'O'},
 * 7: {'P', 'R', 'S'},
 * 8: {'T', 'U', 'V'},
 * 9: {'W', 'X', 'Y'}
 */
public class Question2 {
    public static void main(String args[]) throws IOException {
        char[][] digitLetters = {   {'A', 'B', 'C'},
                                    {'D', 'E', 'F'},
                                    {'G', 'H', 'I'},
                                    {'J', 'K', 'L'},
                                    {'M', 'N', 'O'},
                                    {'P', 'R', 'S'},
                                    {'T', 'U', 'V'},
                                    {'W', 'X', 'Y'}   };

        Scanner input = new Scanner(System.in);

        // Every possible words will be written to the file "words.txt"
        PrintStream ps = new PrintStream("words.txt");

        // Number should be of 4-digits and every digit should be greater than 1
        System.out.print("Please enter a 4-digits number (every digit should be >= 2): ");
        int number = input.nextInt();

        /**
         * last: last digit of input number
         * third: third digit of input number
         * second: second digit of input number
         * first: first digit of input number
         */
        int last = number % 10;
        int third = (number % 100) / 10;
        int second = (number % 1000) / 100;
        int first = number / 1000;

        /**
         * condition: number should be of 4-digits, and
         *   every digit should be greater than 1
         *   if no, then keep entering the number
         */
        while((first < 1 || first > 9) ||
                (last < 2 || third < 2 || second < 2 || first < 2)) {
            System.out.printf("Please check the number... should be as mentioned%n%n");
            System.out.print("Please enter a 4-digits number (every digit should be >= 2): ");
            number = input.nextInt();

            last = number % 10;
            third = (number % 100) / 10;
            second = (number % 1000) / 100;
            first = number / 1000;
        }

        // word: contains each 4 letters word
        char[] word = new char[4];
        for(int i = 0; i < 81; i++) {
            word[3] = digitLetters[last-2][i%3];
            word[2] = digitLetters[third-2][(i%9)/3];
            word[1] = digitLetters[second-2][(i%27)/9];
            word[0] = digitLetters[first-2][(i%81)/27];
            ps.println(word[0] + "" + word[1] + "" + word[2] + "" + word[3]);
        }

        System.out.println("Output written successfully to the file 'words.txt'");
    }
}
