package interfaces;

public class Wind implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Wind.play()");
	}

	@Override
	public String what(){ return "Wind";}
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}

}
