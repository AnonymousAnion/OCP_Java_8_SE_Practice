package living;

public abstract class Living {

	public final boolean ALIVE = true;
	
	public enum Kingdoms {
		
		ANIMAL, PLANT, FUNGI, PROTISTA, BACTERIA, ARCHAEA
	}
	
	//Living Functions
	protected abstract Living reproduce(Living life);
	protected abstract void age();
	
	//Accessors
	public abstract boolean isMale();
	public abstract int getAge();
	public abstract int getWeight();
	
	//Forcing Subclasses to Override core methods from Object
	@Override
	public abstract boolean equals(Object obj);
	@Override
	public abstract int hashCode();
	@Override
	public abstract String toString();
}
