package classes;

public class Birds extends Animal{

	private String type;
	private int legs;
	private int wings;
	
	public Birds(String type, int legs, int wings, float weight, String colour, String foodToEat) {
		super(weight, colour, foodToEat);
		this.type = type;
		this.legs = legs;
		this.wings = wings;
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

	protected int getWings() {
		return wings;
	}

	protected void setWings(int wings) {
		this.wings = wings;
	}
}
