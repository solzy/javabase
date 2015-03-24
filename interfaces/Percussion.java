package interfaces;

public class Percussion implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Percussion.play()");
	}
	
	public String what(){
		return " percussion";
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}

}
