package interfaces;

import java.nio.*;
import java.util.*;

//reserved interface Readable for Scanner class in jdk,
//In order to Scanner could deal with various type parameters

public class RandomWords implements Readable{
    private static Random rand = new Random(47);
    private static final char[] capitals = 
        "SFSDGSDFGRBERWHUIOPKNJHL".toCharArray();
    private static final char[] lowers =
        "seryiuokllnhgyvbtyg".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords( int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count-- == 0) return -1;
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i =0 ; i < 4; i++){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }
    public static void main(String[] args ){
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }

}

