//Using reflection to show all the methods of a class.
//even if the methods are defined in the base class
//{Args: showMethods}

import java.lang.reflect.*;
import java.util.regex.*;

public class ShowMethods{
    private static String usage=
        "usage:\n"+
        "ShowMethods qualified.class.name\n";
    private static Pattern p = Pattern.compile("\\w\\.");

    public static void main(String[] args){
        if(args.length < 1 ){
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors =  c.getConstructors();
            if( args.length == 1 ){
                for(Method m : methods){
                    System.out.println(
                      p.matcher(m.toString()).replaceAll(""));
                }
                System.out.println("-----------------------");
                for(Constructor ctor : ctors){
                    System.out.println(
                       p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            }else{
                for(Method m : methods){
                    if(m.toString().indexOf(args[1]) != -1){
                        System.out.println(
                         p.matcher(m.toString()).replaceAll(""));
                        lines++;
                    }
                }
                System.out.println("-----------------------");
                for(Constructor ctor : ctors){
                    if(c.toString().indexOf(args[1]) != -1){
                        System.out.println(
                         p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        }catch(ClassNotFoundException e){
            System.out.println("No such class: " + e);
        }
    }
}
