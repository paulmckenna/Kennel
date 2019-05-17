
public class TestAnimal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog dog = new Dog("Fido");
		dog.setAnimal("Dog");
		dog.setExerciseTime(30);
		System.out.println(dog.toString());
		System.out.println(); 
		
		Cat cat = new Cat("Minnie");
		cat.setAnimal("cat");
		System.out.println(cat.toString());
		System.out.println();
		
		
		cat.loseLife();
		
	
		
		
		
		
	}


		
	
	
	
	
}
