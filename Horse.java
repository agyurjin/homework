package classes;

public class Horse extends Mammals{

	private String place;
	
	Horse(String place, String type, float weight, float speed, int legs, String colour) {
		super(type, weight, speed, legs, colour);
		this.place = place;
	}

	protected String getPlace() {
		return place;
	}

	protected void setPlace(String place) {
		this.place = place;
	}

	
}
