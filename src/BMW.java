
public class BMW extends Cars{
	public BMW (int startSpeed){
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increaseing speed of BMW");
	}
	
	public void headupDisplayNavigation(){
		System.out.println("BMW Specific Functionality");
	}
	
	/*public void increaseSpeed(int speed){
		
	}*/
}
