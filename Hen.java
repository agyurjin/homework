package classes;

public class Hen extends Birds{

	public Hen(float weight, String colour, String foodToEat) {
		super("domestic", 2, 2, weight, colour, foodToEat);
	}

	@Override
	public String toString() {
		return "Hen [getType()=" + getType() + ", getLegs()=" + getLegs() 
		+ ", getWings()=" + getWings() + ", getWeight()=" + getWeight() 
		+ ", getColour()=" + getColour() + ", getFoodToEat()=" + getFoodToEat() + "]";
	}
	
}
