package interfaces;

public class Music {
	public static void tune (Instrument i){
		i.play();
	}
	
	public static void tuneAll(Instrument[] e){
		for( Instrument i : e){
			tune(i);
		}
	}
	
//	Output result:
//		Wind.play()
//		Percussion.play()
//		Stringed.play()
//		Brass.play()
//		Woodwind.play()

	
	public static void main(String[] args){
		Instrument[]  orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}
