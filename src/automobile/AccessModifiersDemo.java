package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {

		Cars car1 = new Cars(0);
		car1.increaseSpeed();
		car1.speed = 10;
	}

}
// Protected Access modifier only available to sub class
//Private Access modifier only available to the class
//Public Access modifier available everywhere in java world
//No Access modifier available only in the package