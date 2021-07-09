import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter 5 numbers: ");
		
		int cntPos = 0, cntNeg = 0, cntZero = 0;
		
		for(int i = 0; i < 5; i++) {
			int num = inp.nextInt();
			
			if(num > 0)
				cntPos++;
			else if(num < 0)
				cntNeg++;
			else
				cntZero++;
		}
		
		System.out.println("Number of negative numbers: " + cntNeg);
		System.out.println("Number of positive numbers: " + cntPos);
		System.out.println("Number of zero: " + cntZero);
	}

}
