
public class WhileLoopsPractising {

	public static void main(String[] args) {

		int i =10;
		
		while(i < 20){
			//System.out.println(i);
			i++;
			if(i == 17){
				continue;
			}
			System.out.println("Value of i is: " + i);
			
		}
		System.out.println("Outside loop...");
		
		do{ // IN DO-WHILE IT ALWAYS EXECUTES DO FIRST
			System.out.println("do while loop....");
			System.out.println(i);
			i++;
			
		}while(i <10);
	}

}
