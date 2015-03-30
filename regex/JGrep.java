// A very simple version of the "grep" program/
import java.util.regex.*;
import java.io.*;

public class JGrep{
    public static void main(String[] args){
        if(args.length > 2){
            System.exit(0);
        }
        
        Pattern p = Pattern.compile(".*.java");
        File[] files = new File(".").listFiles();
        for(File file : files){
            Matcher m = p.matcher(file.getName());
            while( m.find()){
                System.out.println(m.group());
            }
        }
    
    }
}
