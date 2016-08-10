package classes;

public class Mammals extends Animal {


	private String type;
	
	Mammals(String type, float weight, float speed, int legs, String colour) {
		super(weight, speed, legs, colour);
		this.type = type;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}
	
	
	
}
