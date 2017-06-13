package animal;
import living.Living;
import plant.Plant;

import living.InedibleException;
import living.ReproductionException;

import org.apache.commons.lang3.builder.EqualsBuilder;

import living.GlobalConstants;

/**
 * 
 * @author Liam
 * A Bear is an animal and performs animal functions
 */
public class Bear extends Animal {
	
	public Bear(String name, int weight, int age, boolean male) {
		
		super(name, weight, age, male);
	}

	public Bear(String name, int weight, int age) {
		
		super(name, weight, age);
	}
	
	public Bear(String name, int age) {
		
		super(name, age);
	}
	
	public Bear(String name, int age, boolean male) {
		
		super(name, age, male);
	}
	
	public Bear(String name) {
		
		super(name);
	}
	
	public Bear(String name, boolean male) {
		
		super(name, male);
	}
	
	@Override
	/**
	 * @author Liam
	 * A Bear can only eat animals except itself and other bears.
	 */
	public void eat(Living life) {
		
		if (null == life) {
			
			throw new InedibleException("You can't eat nothing.");
		}
		else if (life instanceof Plant) {
			
			throw new InedibleException("Bears are carnivores! They don't eat plants.");
		}
		else if (life instanceof Bear) {
			
			throw new InedibleException("Bears don't eat bears.");
		}
		else if (life instanceof Animal) {
			
			grow((int) (life.getWeight()*GlobalConstants.FEEDING_ENERGY_ABSORPTION_PROPORTION));
		}
		else {
			
			throw new InedibleException("Whatever that is, bears don't eat it.");
		}
	}
	
	@Override
	/**
	 * @author Liam
	 * A bear can reproduce only with bears of the opposite sex to produce a baby cub
	 */
	public Bear reproduce (Living life) {
		
		if (null == life) {
			
			throw new ReproductionException("You can't mate with nothing. Sorry.");
		}
		else if (life instanceof Bear) {
			
			if (!(this.male == life.isMale())) {
				
				//TODO make a way of namely new bears uniquey
				return new Bear("Baby cub");
			}
			else {
				
				throw new ReproductionException("You can only reproduce with Bears of the opposite sex.");
			}
		}
		else {
			
			throw new ReproductionException("You can't mate with that.");
		}
	}
}
