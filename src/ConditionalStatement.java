
public class ConditionalStatement {

	public static void main(String[] args) {

		/*int value1 = 10;
		int value2 = 20;
		int value3 = 10;
		
		boolean condition = value1 == value2;
		System.out.println(condition);
		
		if(value1 == value3){
			System.out.println("Yes, True");*/
		
		int score = 79;
		String grade;
		
		if (score > 90){
			grade = "A";
		}
		else if (score > 80){
			grade = "B";
		}
		else {
			grade = "C";
		}
		System.out.println("Score is: " + score);
		System.out.println("Grade is: " + grade);
	}

}
