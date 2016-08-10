package classes;

public class Mammals extends Animal {


	private String type;
	
	Mammals(String type, float weight, float speed, int legs) {
		super(weight, speed, legs);
		this.type = type;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}
	
	
	
}
