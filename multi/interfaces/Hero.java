package multi.interfaces;


public class Hero extends ActionCharacter implements
	  CanFight, CanSwim , CanFly{
	
	//Ignore fight method , because exist in ActionCharacter class
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
