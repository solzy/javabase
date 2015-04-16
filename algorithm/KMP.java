package algorithm;

import java.util.Arrays;

public class KMP2 {
  private static Integer[] next;
  private String str;
  private String subStr;
  
  public KMP2( String str, String subStr){
    next  = new Integer[subStr.length()+1];
    //initialize next array
    for (int k = 0 ; k < next.length; k ++) {
      next[k] = 0;
    }
    this.str = str;
    this.subStr = subStr;
  }
  

  public void next() {
    int i = 0, j = -1;
    next[i] = j;
    while (i < subStr.length() ) {
      while( j >= 0 &&  subStr.charAt(i) != subStr.charAt(j)){
        j = next[j];
      }
      i++;
      next[i] = ++j;
    }
  }

  public int KMPsearch( ){
    int j = 0;
    for( int i = 0 ; i < str.length() && j < subStr.length() ; ){
      if( j == -1 || str.charAt(i) == subStr.charAt(j)){
        i++;
        j++;   
      }else{
        i += j - next[j];
        j = next[j];
      }
      if( j == subStr.length()){
        return i - j;
      }
    }
    return -1;
  }


  public static void  main(String[] args){
    String str = "cabdababaa";
    String sbuStr = "ababaa";
    KMP2 kmp = new KMP2(str,sbuStr);
    kmp.next();
    System.out.println(sbuStr.length());
    System.out.println(Arrays.asList(next));
    System.out.println(kmp.KMPsearch());
  }
}
