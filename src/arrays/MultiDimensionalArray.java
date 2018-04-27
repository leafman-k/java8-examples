package arrays;

public class MultiDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare multidimensional array
		
		String[][] multiDimensionals = {{"Mr. ", "Mrs. ", "Ms. "},{"Smith", "Jones"}};
		
		//Print first column of first and second array
		System.out.println("Welcome " + multiDimensionals[0][0] + multiDimensionals[1][0]);
		//Print third column of first array and second column of second array
		System.out.println("Welcome " + multiDimensionals[0][2] + multiDimensionals[1][1]);
	}
}
