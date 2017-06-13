package simulation;

import living.*;
import animal.*;
import plant.*;

public final class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bear bear = new Bear("Barry", 8, 0, true);
		Bear beary = new Bear("Barry", 8, 0, true);
		Deer deer = new Deer("Barry", 8, 0, true);
		Deer deery = new Deer("Barry", 8, 0, true);
		System.out.println(bear);
		System.out.println(deer);
		System.out.println(bear.equals(deer));
		System.out.println(bear.equals(beary));
		System.out.println(deer.equals(deery));
	}

}
