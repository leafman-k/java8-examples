package arrays;

import java.util.Arrays;

public class CopyRangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = {1,2,3,4,5,6,7,8,9,10};
		int[] copiedArray = Arrays.copyOfRange(anArray, 3, 7);
		//Test
		for(int item : copiedArray) {
			System.out.println("CopiedArray value in column: " + item);
		}
	}

}
