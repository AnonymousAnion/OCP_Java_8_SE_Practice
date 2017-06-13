package plant;
import living.Living;

public abstract class Plant extends Living {

	//General Plant Variables
	Kingdoms KINGDOM = Kingdoms.PLANT;
	
	protected int age;
	protected int weight;
	
	//General Plant Constructor
	protected Plant(int age, int weight) {
		
		this.age = age;
		this.weight = weight;
	}
	
	protected Plant(int weight) {
		
		this.age = 0;
		this.weight = weight;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public int getWeight() {
		
		return this.weight;
	}
	
	//Plant Functions
	public abstract void grow();
	
	//Accessor Methods
	public abstract String getName();
}
