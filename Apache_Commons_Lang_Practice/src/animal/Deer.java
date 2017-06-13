package animal;
import living.Living;
import living.ReproductionException;
import plant.Plant;

import living.InedibleException;

import org.apache.commons.lang3.builder.EqualsBuilder;

import living.GlobalConstants;

/**
 * 
 * @author Liam
 * A Deer is an animal and performs animal functions
 */
public class Deer extends Animal {
	
	public Deer(String name, int weight, int age, boolean male) {
		
		super(name, weight, age, male);
	}

	public Deer(String name, int weight, int age) {
		
		super(name, weight, age);
	}
	
	public Deer(String name, int age) {
		
		super(name, age);
	}
	
	public Deer(String name, int age, boolean male) {
		
		super(name, age, male);
	}
	
	public Deer(String name) {
		
		super(name);
	}
	
	public Deer(String name, boolean male) {
		
		super(name, male);
	}
	
	@Override
	/**
	 * @author Liam
	 * A deer can only eat plants
	 */
	public void eat(Living life) {
		
		if (null == life) {
			
			throw new InedibleException("You can't eat nothing.");
		}
		else if (life instanceof Animal) {
			
			throw new InedibleException("Deers are herbivores! They don't eat animals.");
		}
		else if (life instanceof Plant) {
			
			grow((int) (life.getWeight()*GlobalConstants.FEEDING_ENERGY_ABSORPTION_PROPORTION));
		}
		else {
			
			throw new InedibleException("Whatever that is, Deers don't eat it.");
		}
	}
	
	@Override
	/**
	 * @author Liam
	 * A deer can reproduce only with deer of the opposite sex to produce a baby fawn.
	 */
	public Deer reproduce (Living life) {
		
		if (null == life) {
			
			throw new ReproductionException("You can't mate with nothing. Sorry.");
		}
		else if (life instanceof Deer) {
			
			if (!(this.male == life.isMale())) {
				
				//TODO make a way of namely new deer uniquey
				return new Deer("Baby fawn");
			}
			else {
				
				throw new ReproductionException("You can only reproduce with Deer of the opposite sex.");
			}
		}
		else {
			
			throw new ReproductionException("You can't mate with that.");
		}
	}
}
