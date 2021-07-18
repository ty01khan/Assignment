import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author  Talha Yaseen
 */
public class ReadResponses {
    public static void main(String args[]) {
        Scanner input = null;
        try {
            File f = new File("number.txt");
            input = new Scanner(f);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        Formatter out = null;
        try {
            out = new Formatter("output.txt");

            while (input.hasNextInt()) {
                out.format("%d\n", input.nextInt());
            }

            System.out.println("Survey responses copied successfully to the file 'output.txt'");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(input != null) {
                input.close();
            }

            if(out != null) {
                out.close();
            }
        }
    }
}
