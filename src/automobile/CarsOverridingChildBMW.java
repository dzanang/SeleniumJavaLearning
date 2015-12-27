package automobile;

/***
 * Arguments List in the overriding method should be same as the parent class overridden method
 * Access modifier of the overriding method cannot be more restrictive than the overridden method
 * private, static and final method cannot be overridden as they are local to the class
 * @author dzana
 *
 */

public class CarsOverridingChildBMW extends CarsOverridingParent {

	public static void main(String[] args) {
		CarsOverridingParent c1 = new CarsOverridingChildBMW(); // dynamic
																// method
																// dispatch
		c1.increaseSPeed();
		c1.engineStart(2);
	}

	@Override
	public void engineStart(int cyl) {
		// super.engineStart(2);
		System.out.println("I am from the child class");
	}
}
