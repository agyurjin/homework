package classes;

public abstract class Animal {

	private float weight;
	private float speed;
	private int legs;
	
	Animal(float weight, float speed, int legs){
		this.weight = weight;
		this.speed = speed;
		this.legs = legs;
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
	
	
}
