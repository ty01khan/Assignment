public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact;
		
		System.out.println("n   n!");
		for(int i = 1; i <= 20; i++) {
			fact = 1;
			for(int j = 1; j <= i; j++) {
				fact *= j;
			}
			
			if(i < 10)
			System.out.println(i + "   " + fact);
			else
				System.out.println(i + "  " + fact);
		}
		
		System.out.printf("\nValue of 100! is out of the range of long data type\n");
	}
}
