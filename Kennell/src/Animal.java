/* @author Paul Mckenna
 * Version 160519
 * Week 3_Lab1_Ex2
 */


abstract class Animal {
	
	static String name;
	String animal;

	public Animal(String nameIn) {
		// TODO Auto-generated constructor stub
		
		name = nameIn;
	}

	public String getName() {
		
		return name;
		
	}
	public void setAnimal(String animalIn)
	{
		
		animal = animalIn;
	}
	
	public String getAnimal() {
		
		return animal;
		
	}
	
	
	public String toString() {
		
		return "The name of the " + getAnimal() + " is " + getName();
		
	}
}
