
public class Dog extends Animal {

	int exerciseTime;
	public Dog(String nameIn) {

		super(nameIn);
	}

	public void setExerciseTime(int exTimeIn) {
		
		exerciseTime = exTimeIn ;
		
	}
	
	public int getExerciseTime() {
		
		return exerciseTime;
		
	}
	
 
	
public String toString() {
		
		return super.toString() + "\n" + "\n" + "The " + getAnimal() + " needs " + getExerciseTime() + " minutes exercise everyday.";
		
	}
}
