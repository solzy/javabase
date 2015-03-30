import java.util.regex.*;

public class Reflags{

    public static void main(String[] args){
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher("java has regex\n"+
                    "JAVA has pretty good language\n"+
                    "Regular expressions are in java");
        while(m.find()){
            System.out.println(m.group());
        }
    }
}



