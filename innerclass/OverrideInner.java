// The inner-class could not be covered.
// In this example , the two inner-calss Yolk are independently
public class OverrideInner{
    public class Egg{
        private Yolk y;
        protected class Yolk{
            public Yolk(){
                System.out.println("Egg.yolk");
            }   
        }

        public Egg(){
            System.out.println("New Egg!");
            y = new Yolk();
        }
    }

    public class BigEgg extends Egg{
        public class Yolk{
            public Yolk(){
                System.out.println("BigEgg .yolk()");
            }
        }
    }

    public static void main(String[] args){
        OverrideInner oi = new OverrideInner();
        oi.new BigEgg();
        // Output:
        // new Egg()!
        // Egg.Yolk()

    }
}
