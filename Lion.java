package classes;

public class Lion extends Mammals{

	public Lion(float weight, String colour, String foodToEat) {
		super("wild", 4, weight, colour, foodToEat);
	}

	@Override
	public String toString() {
		return "Lion [getType()=" + getType() + ", getLegs()=" + getLegs() 
		+ ", getWeight()=" + getWeight() + ", getColour()=" + getColour() 
		+ ", getFoodToEat()=" + getFoodToEat() + "]";
	}

}
