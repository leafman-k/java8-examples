package arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = {1,2,3,4,5,6,7,8,9,10};
		int[] copiedArray = new int[3];
		System.arraycopy(anArray, 7, copiedArray, 0, 3);
		//Test
		for(int item : copiedArray) {
			System.out.println("CopiedArray value in column: " + item);
		}
	}

}
