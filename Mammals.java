package classes;

public class Mammals extends Animal {

	private String type;
	private int legs;
	
	public Mammals(String type, int legs, float weight, String colour, String foodToEat) {
		super(weight, colour, foodToEat);
		this.type = type;
		this.legs = legs;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected int getLegs() {
		return legs;
	}

	protected void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Mammals [type=" + type + ", legs=" + legs + ", getWeight()=" + getWeight() + ", getColour()="
				+ getColour() + ", getFoodToEat()=" + getFoodToEat() + "]";
	}

	
	
	
}
