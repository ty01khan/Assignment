import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Talha Yaseen
 */
public class TakeResponses {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        Formatter out = null;

        try {
            out = new Formatter("number.txt");
            System.out.println("Please enter 10 values between 1 and 6 (both included)");

            int i = 1;
            while(i <= 10) {
                if (i % 10 == 1)
                    System.out.printf("Enter %dst number: ", i);
                else if (i % 10 == 2)
                    System.out.printf("Enter %dnd number: ", i);
                else if (i % 10 == 3)
                    System.out.printf("Enter %drd number: ", i);
                else
                    System.out.printf("Enter %dth number: ", i);

                int x = inp.nextInt();
                if(x > 6 || x < 1) {
                    System.out.printf("Input should be >= 1 and <= 6... enter the number again%n%n");
                    continue;
                }

                out.format("%d\n", x);
                i++;
            }
        } catch(IOException exp) {
            exp.printStackTrace();
        } finally {
            if(out != null) {
                out.close();
            }
        }
    }
}
