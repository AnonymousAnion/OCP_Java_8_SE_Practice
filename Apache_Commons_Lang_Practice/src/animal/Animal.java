package animal;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import living.Living;

public abstract class Animal extends Living {
	
	//General Animal Variables
	Kingdoms KINGDOM = Kingdoms.ANIMAL;
	
	protected String name;
	protected int age;
	protected int weight;
	protected boolean male;
	
	
	//General Animal Constructor
	protected Animal(String name, int weight, int age, boolean male) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.male = male;
	}

	protected Animal(String name, int weight, int age) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
		if (Math.random() >= 0.5) {
			
			this.male = true;
		}
		else {
			
			this.male = false;
		}
	}
	
	protected Animal(String name, int age) {
		
		this(name, (int) (Math.random()*2+7.5), age);
	}
	
	protected Animal(String name, int age, boolean male) {
		
		this(name, (int) (Math.random()*2+7.5), age, male);
	}
	
	protected Animal(String name) {
		
		this(name, 0);
	}
	
	protected Animal(String name, boolean male) {
		
		this(name, 0, male);
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public int getWeight() {
		
		return this.weight;
	}
	
	public boolean isMale() {
		
		return male;
	}

	//Animal Functions
	protected void age() {
		
		age++;
	}
	
	protected void grow(int weight) {
		
		this.weight += weight;
	}
	
	protected void grow() {
		
		this.weight++;
	}
	
	protected abstract void eat(Living life);
	
	@Override
	/**
	 * @author Liam
	 * An animal is equivalent to another animal if they are the same species
	 * and they share all attributes
	 */
	public boolean equals(Object obj) {
		
		return EqualsBuilder.reflectionEquals(this,  obj);
	}
	
	@Override
	/**
	 * @author Liam
	 * an animal's name's hash code will serve as its hash code
	 */
	public int hashCode() {
		
		return name.hashCode();
	}
	
	@Override
	/**
	 * @author Liam
	 * Animals will have all their attributes displayed including their name
	 * in a concise style without their memory address included.
	 */
	public String toString() {
		
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
