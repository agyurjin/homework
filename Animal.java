package classes;

public abstract class Animal{

	private float weight;
	private String colour;
	private String foodToEat;
	
	public Animal(float weight, String colour, String foodToEat) {
		this.weight = weight;
		this.colour = colour;
		this.foodToEat = foodToEat;
	}

	protected float getWeight() {
		return weight;
	}

	protected void setWeight(float weight) {
		this.weight = weight;
	}

	protected String getColour() {
		return colour;
	}

	protected void setColour(String colour) {
		this.colour = colour;
	}

	protected String getFoodToEat() {
		return foodToEat;
	}

	protected void setFoodToEat(String foodToEat) {
		this.foodToEat = foodToEat;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", colour=" + colour + ", foodToEat=" + foodToEat + "]";
	}
	
	
	
}
