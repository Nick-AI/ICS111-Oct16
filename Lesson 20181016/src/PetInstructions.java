/**
 * You are leaving your house for a long time, and somebody needs to take care of your pet.
 * Give them instructions for taking care of your pet, depending on what kind of animal the pet is.
 * 
 * @author Camelia Lai
 *
 */
public class PetInstructions {

	public static void main(String[] args) {
		
		// TODO: Change this line! Use the constructor that takes in a String type, and give your pet a type.
		Animal myPet = new Animal();
		
		// When you are done, run the program and see if it prints the correct instruction for your pet.
		instructions(myPet);

	}
	
	/**
	 * Prints the instructions for taking care of your pet, depending on what kind of animal it is.
	 * @param pet: an Animal object.
	 */
	public static void instructions(Animal pet) {
		// TODO: Complete this method to print the instructions for taking care of your animal depending on its type.
		// Dogs should be walked.
		// Cats should be fed.
		// Birds should be whistled at.
		// Rabbits should be given lettuce.
		// Fish should have their tank water changed.
		// Ponies should have their hair brushed.
		// Pet plants (some people consider them animal pets) should be watered and given some sun.
		// If the pet's type isn't listed, print "I don't know what to do with your animal."
		// USE A SWITCH STATEMENT
		// Hint 1: Get the animal's type first and assign it to a variable. 
		// Hint 2: The methods in the Animal class already print something.
	}

}
