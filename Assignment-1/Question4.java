import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.printf("Please enter employee-%d name: ", i);
			String emp = inp.nextLine();
			
			System.out.printf("Please enter worked hour by %s: ", emp);
			int hr = Integer.parseInt(inp.nextLine());
			
			System.out.printf("Please enter hourly rate of %s: ", emp);
			double hRate = Double.parseDouble(inp.nextLine());
			
			double grossPay;
			if(hr >= 40) {
				grossPay = 40*hRate + (hr - 40)*hRate/2;
			}
			else {
				grossPay = hr*hRate;
			}
			
			System.out.printf("\nGross pay of %s is %.1f\n\n", emp, grossPay);
		}
	}

}
