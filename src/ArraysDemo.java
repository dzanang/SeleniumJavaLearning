import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] myIntArray1 = { 100, 90 };
		/*
		 * myIntArray1 = new int[10];
		 * 
		 * myIntArray1[0] = 100; myIntArray1[1] = 90;
		 */

		System.out.println("0 index: " + myIntArray1[0]);
		System.out.println("1st index: " + myIntArray1[1]);
		// System.out.println("2nd index: " + myIntArray1[2]);

		String[] myStringArray1 = { "bmw", "audi", "honda" };
		System.out.println("0 index: " + myStringArray1[0]);
		System.out.println("1st index: " + myStringArray1[1]);
		System.out.println("2nd index: " + myStringArray1[2]);

		int length1 = myIntArray1.length;
		int length2 = myStringArray1.length;

		System.out.println("Length of array1 is: " + length1);
		System.out.println("Length of array2 is: " + length2);
		
		//LOOPS ARRAY VALUES
		for(int i = 0; i <length1; i++){
			System.out.println(myIntArray1[i]);
		}
		
		Arrays.sort(myIntArray1); // SORTS ARRAYS BY VALUES
		for(int i = 0; i <length1; i++){
			System.out.println(myIntArray1[i]);
		}
		//COPYING ARRAYS - TO EXPLORE ADDITIONALLY
		//System.arraycopy(src, srcPos, dest, destPos, length);
	}
}
