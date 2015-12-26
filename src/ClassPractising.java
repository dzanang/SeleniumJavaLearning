class Car {
	int year;
	private String make;

	/*
	 * void getYear(){ System.out.println("The year is: " + year); }
	 */

	int getYear() {
		return year;
	}
	
	void setMake(String makeOfCar){
		make = makeOfCar;
	}
	String getMake(){
		return make;
	}
}

public class ClassPractising {

	public static void main(String[] args) {
		Car car1 = new Car();
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
