package automobile;
class Car {
	int year;
	private String make;
	int speed;
	int gear;
	
	public Car () { //EVERY CLASS HAS A DEFAULT CONSTRUCTOR WITH DEFAULT VALUES EVEN IF WE DON'T CREATE ONE
		this(1, 0); // CALLING A CONSTRUCTOR WITHIN A CONSTRUCTOR
		gear = 1;
		speed = 0;	
		
		
		System.out.println("Executing constructor without arguments...");
	}
	
	public Car(int startGear, int startSpeed){
		gear = startGear;
		speed = startSpeed;
		
		System.out.println("Executing constructor with arguments...");
	}

	/*
	 * void getYear(){ System.out.println("The year is: " + year); }
	 */

	int getYear() {
		return year;
	}
	
	void setMake(String make){
		this.make = make;
		
		/*void setMake(String makeOfCar){
			make = makeOfCar;*/  // WHEN AN ARGUMENT IS NOT THE SAME AS THE VARIABLE THERE'S NO NEED TO USE this.
	}
	String getMake(){
		return make;
	}
	
}

public class ClassPractising {

	public static void main(String[] args) {
		Car car1 = new Car();
		//Car car1 = new Car(1, 0); //FIRST CONSTRUCTOR IS CALLED AUTOMATICALLY IF WE DON't PUT IN ANY ARGUMENTS
		car1.year = 2014;
		//car1.make = "Mini Cooper"; IF THE VARIABLE IS PRIVATE YOU CAN ONLY ACCESS IT THROUGH GETTERS AND SETTERS
		
		String mk = "Audi";
		car1.setMake(mk);
		//car1.setMake("BMW"); VALUE CAN BE GIVEN INSIDE OF THE BRACKETS

		int yearOfCar = car1.getYear();
		String mk1 = car1.getMake();
		
		System.out.println(mk1);
		// System.out.println(car1.getYear()); CAN BE CALLED DIRECTLY
		System.out.println(yearOfCar); // CAN BE CALLED THROUGH A CREATED
										// VARIABLE OF THE SAME TYPE

		//System.out.println("The make of car is: " + car1.make + " and the year of production is: " + car1.year);
		//THE PRINT ABOVE THROWS AN ERROR BECAUSE IT CANNOT ACCESS THE car1.make
		
		System.out.println("The make of car is: " + mk1 + " and the year of production is: " + car1.year);
	}

}
