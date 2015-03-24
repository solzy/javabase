package abstracts;

public abstract class Instrument {
	public abstract void play();
	public String what(){ 
		System.out.println("this a abstract class !");
		return "abstract";
	}
	public abstract void adjust();
}
