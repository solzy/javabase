public class Human{
    class Annoyance extends Exception{}
    class Sneeze extends Annoyance{}
    
    public static void main(String[] args){
        //Catch the exact type
        //To match the latest exception(include base class)
        Human h = new Human();
        try{
            throw h.new Sneeze();
        }catch( Sneeze s){
            System.out.println("Catch Sneeze!");
        }catch( Annoyance a){
            System.out.println("Catch Sneeze!");
        }

        try{
            throw h.new Sneeze();
        }catch(Annoyance a){
            System.out.println("~~~Catch Sneeze!");
        }
    }
}
