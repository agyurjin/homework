package classes;

public abstract class Animal {

	private float weight;
	private float speed;
	private int legs;
	private String colour;
	
	Animal(float weight, float speed, int legs, String colour){
		this.weight = weight;
		this.speed = speed;
		this.legs = legs;
		this.colour = colour;
	}
	
	protected float getWeight() {
		return weight;
	}
	protected void setWeight(float weight) {
		this.weight = weight;
	}
	protected float getSpeed() {
		return speed;
	}
	protected void setSpeed(float speed) {
		this.speed = speed;
	}
	protected int getLegs() {
		return legs;
	}
	protected void setLegs(int legs) {
		this.legs = legs;
	}

	protected String getColour() {
		return colour;
	}

	protected void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
