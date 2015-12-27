import automobile.BMW;
import automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		Cars car1 = new Cars(speed);
		car1.increaseSpeed();
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();
	}

}
