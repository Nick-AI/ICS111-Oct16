/**
 * A class representing animals and some actions that can be done for them
 * You do not need to modify this class.
 * 
 * @author Camelia Lai
 *
 */
public class Animal {
	
	public String type; // The type of animal
	
	/**
	 * Default constructor that gives an Animal object the type of "A generic animal"
	 */
	public Animal() {
		this.type = "A generic animal";
	}

	/**
	 * Another constructor where the type of the animal is specified.
	 * 
	 * @param type: A String, the type of the new Animal object
	 */
	public Animal(String type) {
		this.type = type;
	}

	/**
	 * Return the animal's type
	 * @return String type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * A method for walking the animal
	 */
	public void walk() {
		System.out.println("Please take the animal for a walk.");
	}

	/**
	 * A method for feeding the animal
	 */
	public void feed() {
		System.out.println("Please give the animal some food.");
	}

	/**
	 * A method for whistling at the animal
	 */
	public void whistleAtIt() {
		System.out.println("Please whistle at the animal.");
	}

	/**
	 * A method for giving the animal lettuce
	 */
	public void giveItLettuce() {
		System.out.println("Please give my animal some lettuce");
	}
	
	/**
	 * A method for changing the animal's tank water
	 */
	public void changeWater() {
		System.out.println("Please put some new water in my animal's tank.");
	}
	
	/**
	 * A method for brushing the animal's hair
	 */
	public void brush() {
		System.out.println("Please brush my animal's hair.");
	}
	
	/**
	 * A method for watering the animal and giving it some sun
	 */
	public void water() {
		System.out.println("Please water my animal and give it some sun.");
	}

}
