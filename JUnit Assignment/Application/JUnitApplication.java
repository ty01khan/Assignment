package Application;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class JUnitApplication {	
	public int minArray(int[] arr) {
		int min = arr[0];
		for(int e : arr) {
			if(e < min) {
				min = e;
			}
		}
		
		return min;
	}
	
	public int maxArray(int[] arr) {
		int max = arr[0];
		for(int e : arr) {
			if(e > max) {
				max = e;
			}
		}
		
		return max;
	}
	
	public int sumArray(int[] arr) {
		int sum = 0;
		for(int e : arr) {
			sum += e;
		}
		
		return sum;
	}
	
	public String findElement(int x, int[] arr) {
		String find = null;
		for(int e : arr) {
			if(e == x) {
				find = "Y";
				break;
			}
		}
		
		return find;
	}
}
