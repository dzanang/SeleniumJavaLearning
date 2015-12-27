package automobile;

/***
 * Sequence/order of data type of arguments
 * 
 * @author dzana
 *
 */

public class CarsOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight(2, "5");
		increaseSeatHeight(8, "3");
		
		

	}

	public static void increaseSeatHeight(int variable1, String variable2) {
		System.out.println("I am the 1st overload");
		
	}
	public static void increaseSeatHeight(String variable3, String variable4) {
		System.out.println("I am the 2st overload");
		
	}
}
