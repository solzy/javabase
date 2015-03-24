package interfaces;

public class Stringed implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Stringed.play()");
	}
	
	public String what(){
		return "Stringed";
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}

}
