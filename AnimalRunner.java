package classes;

public class AnimalRunner {

	public static void main(String[] args){

		Horse horse1 = new Horse(100, "black", "grass");
		Lion lion1 = new Lion(200,"Yellow", "meat");
		
		Mammals[] mammals1 = new Mammals[2];
		mammals1[0] = horse1;
		mammals1[1] = lion1;

		Hen hen1 = new Hen(20, "Brown", "crop");
		Eagle eagle1 = new Eagle(25,"Black","mice");

		Birds[] birds1 = new Birds[2];
		birds1[0] = hen1;
		birds1[1] = eagle1;

		Animal[] allAnimals = new Animal[4];
		
		allAnimals[0] = mammals1[0];
		allAnimals[1] = mammals1[1];
		allAnimals[2] = birds1[0];
		allAnimals[3] = birds1[1];
		
		for(Animal i : allAnimals)
			System.out.println(i.toString());
	}
}
