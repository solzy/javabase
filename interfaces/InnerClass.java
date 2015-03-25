package interfaces;

// Returning an instance of an anonymous inner class 

public class InnerClass{
	public class MyContents implements Contents{

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            public int value(){ return i;}
        };
    }

    public static void main(String[] args){
        InnerClass ic = new InnerClass();
        System.out.println(ic.contents().value());
    }
}
