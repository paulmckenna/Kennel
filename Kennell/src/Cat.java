
public class Cat extends Animal{

	int livesLeft = 10;
	
	public Cat(String nameIn) {
		// TODO Auto-generated constructor stub
		
		super(nameIn);
		
	}
	
	public int getLivesLeft()
	
	{
	
		return livesLeft;
	}
	
	public void loseLife()
	
	{
	for (int i = 9; i > 0; i--)
		
				
			
		{
		livesLeft = livesLeft -1;	
		getLivesLeft();
		if (livesLeft > 0)
		{
		
		System.out.println("The cat has " + livesLeft + " lives left.");
		System.out.println();
		
		}
		
		else
		{
			System.out.println("The Cat is Dead!!");
		}
		}
		
	}
	

	public String toString () {
		
		return super.toString();
		
	}
}
