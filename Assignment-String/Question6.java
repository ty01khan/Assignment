package Assignment3;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * Ludic numbers: list of natural numbers (starting from 2) 
 *   and removing i-th number in i-th iteration (where i begins with 2).
 *   In every iteration, the first removed number is Ludic.
 *   1 is considered as Ludic
 *   
 *   Process of generating Ludic numbers :
 *   	Ludic = {1, …}
 *      Consider natural numbers from 2,
 *      2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 …
 *      
 *      Delete every 2nd number
 *      3, 5, 7, 9, 11, 13, 15, 17, 19 ..
 *      The first deleted number is 2.
 *      Ludic = {1, 2, …}
 *      
 *      Delete every 3rd number.
 *      5, 7, 11, 13, 17, 19, 22 ..
 *      The first deleted number is 3
 *      Ludic = {1, 2, 3, …}
 *      
 *      Delete every 4th number.
 *      5, 7, 11, 13, 17, 19, 22 ..
 *      The first deleted number is 5
 *      Ludic = {1, 2, 3, 5, ..}
 *      
 *      This process continues.. 
 *      
 *   Examples :
 *      Input : n = 10
 *      Output : 1, 2, 3, 5, 7
 *      
 *      Input : n = 25
 *      Output : 1, 2, 3, 5, 7, 11, 13, 17, 23, 25 
 */
public class Question6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter n: ");
		int n = inp.nextInt();
		
		/**
		 * nnlist: arrayList containing remaining natural numbers
		 */
		ArrayList<Integer> nnlist = new ArrayList<Integer>(n-1);
		for(int i = 2; i <= n; i++) {
			nnlist.add(i-2, i);
		}

		/**
		 * alist: containing ludic numbers
		 */
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		
		/**
		 * run while loop until when size of nnlist
		 *    is greater than its first element.
		 */
		int first = nnlist.get(0);
		while(first < nnlist.size()) {
			alist.add(nnlist.get(0));
			
			for(int j = 0; j < nnlist.size(); j++) {
				if(j % first == 0)
					nnlist.set(j, 0);
			}
			
			// removing i-th element
			for(int j = 0; j < nnlist.size(); j++) {
				if(nnlist.get(j) == 0)
					nnlist.remove(j);
			}
			
			first = nnlist.get(0);
		}
		
		/**
		 *  when size of nnlist is lesser then its first
		 *    element then remaining number except first
		 *    element of nnlist are ludic numbers. So, 
		 *    merge nnlist into alist.
		 */
		alist.addAll(nnlist);
		nnlist.clear();
		
		System.out.print("Ludic numbers are: ");
		for(Integer i : alist) {
			if(i != alist.get(alist.size()-1))
				System.out.print(i + ", ");
			else
				System.out.println(i);
		}
		
		inp.close();
	}

}
