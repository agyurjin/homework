package classes;

public class Horse extends Mammals{

	public Horse(float weight, String colour, String foodToEat) {
		super("domestic", 4, weight, colour, foodToEat);
	}

	@Override
	public String toString() {
		return "Horse [getType()=" + getType() + ", getLegs()=" + getLegs() 
		+ ", getWeight()=" + getWeight() + ", getColour()=" + getColour() 
		+ ", getFoodToEat()=" + getFoodToEat() + "]";
	}
	
}
