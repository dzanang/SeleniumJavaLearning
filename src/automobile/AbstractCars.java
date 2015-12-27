package automobile;

@SuppressWarnings({ "unused", "unused" })
public abstract class AbstractCars {
	private int privateSpeed;
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit=100;
	
	public AbstractCars(){
		this(0);
	}
	
	public AbstractCars(int startSpeed){
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed){
		this.privateSpeed = pSpeed;
	}
	
	public void engineStart(String keyType, int numOfCyl){
		System.out.println("This is the BMW engine start");
	}
		
	}


