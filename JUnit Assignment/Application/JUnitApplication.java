package Application;

public class JUnitApplication {
	int[] arr = {5, 8, 7, 2, 6, 3, 9, 1, 4};
	
	public int minArray() {
		int min = arr[0];
		for(int e : arr) {
			if(e < min) {
				min = e;
			}
		}
		
		return min;
	}
	
	public int maxArray() {
		int max = arr[0];
		for(int e : arr) {
			if(e > max) {
				max = e;
			}
		}
		
		return max;
	}
	
	public int sumArray() {
		int sum = 0;
		for(int e : arr) {
			sum += e;
		}
		
		return sum;
	}
	
	public String findElement(int x) {
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
