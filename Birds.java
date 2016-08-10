package classes;

public class Birds extends Animal{

	private String type;
	private boolean fly;
	
	Birds(String type, boolean fly, float weight, float speed, int legs) {
		super(weight, speed, legs);
		this.type = type;
		this.fly = fly;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected boolean isFly() {
		return fly;
	}

	protected void setFly(boolean fly) {
		this.fly = fly;
	}

	
}
