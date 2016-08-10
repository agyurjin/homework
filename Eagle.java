package classes;

public class Eagle extends Birds{

	public Eagle(float weight, String colour, String foodToEat) {
		super("wild", 2, 2, weight, colour, foodToEat);
	}

	@Override
	public String toString() {
		return "Eagle [getType()=" + getType() + ", getLegs()=" + getLegs() 
		+ ", getWings()=" + getWings() + ", getWeight()=" + getWeight() 
		+ ", getColour()=" + getColour() + ", getFoodToEat()=" + getFoodToEat() + "]";
	}


}
