import java.util.Scanner;
import java.util.Stack;

/**
 * @author Talha Yaseen
 *
 *  Tower of Hanoi problem
 *    Algorithm:
 *      Move n-1 discs from A to B using C
 *      Move a disc from A to C
 *      Move n-1 discs from B to C using A
 */
public class Question4 {
    static Stack s1 = new Stack();
    static Stack s2 = new Stack();
    static Stack s3 = new Stack();

    public static void move(int n, int t1, int t2, int t3) {
        if(n > 0) {
            move(n-1, t1, t3, t2);

            System.out.printf("Move a disc from T-%d to T-%d%n", t1, t3);

            if(t1 == 1 && t3 == 2) {
                s2.push(s1.pop());
            }
            else if(t1 == 1 && t3 == 3) {
                s3.push(s1.pop());
            }
            else if(t1 == 2 && t3 == 1) {
                s1.push(s2.pop());
            }
            else if(t1 == 2 && t3 == 3) {
                s3.push(s2.pop());
            }
            else if(t1 == 3 && t3 == 1) {
                s1.push(s3.pop());
            }
            else if(t1 == 3 && t3 == 2) {
                s2.push(s3.pop());
            }

            move(n-1, t2, t1, t3);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n (number of discs in first tower): ");
        int n = inp.nextInt();

        for(int i = n; i >= 1; i--) {
            s1.push(i);
        }
        System.out.printf("%nAll discs are in Tower-1%n");
        System.out.println("Initial size of stack-1 is: " + s1.size());
        System.out.println("Initial size of stack-2 is: " + s2.size());
        System.out.println("Initial size of stack-3 is: " + s3.size());
        System.out.println();

        move(n, 1, 2, 3);

        System.out.printf("%nAll discs are moved to Tower-3%n");
        System.out.println("Final size of stack-1 is: " + s1.size());
        System.out.println("Final size of stack-2 is: " + s2.size());
        System.out.println("Final size of stack-3 is: " + s3.size());

        System.out.printf("%nElements of stack-3 are: ");
        n = s3.size();
        for(int i = 0; i < n; i++) {
            System.out.print(s3.pop() + " ");
        }
    }
}
