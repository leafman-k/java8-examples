/**
 * 
 */
package arrays;

/**
 * Simple Array demo 
 * @author kimmo
 *
 */
public class SimpleArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declares an array of integers
		int[] anArray;
		
		//creates array of integers
		anArray = new int[10];
		//Test 
		for(int i = 0; i < anArray.length; i++) {
			anArray[i] = i + 1;
		}
		//Test
		for(int item: anArray) {
			System.out.println("Value in column: " + item);
		}
		
		int[] secondArray = {1,2,3,4,5,6};
		//Test
		for(int item : secondArray) {
			System.out.println("SecondArray value in column: " + item);
		}
	}
	
}
