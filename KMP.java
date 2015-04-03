
import java.util.Arrays;

public class KMP {
  private static Integer[] next;
  private String str;
  private String subStr;
  
  public KMP( String str, String subStr){
    next  = new Integer[subStr.length()];
    //initialize next array
    next[0] = -1;
    for (int k = 1; k < next.length; k ++) {
      next[k] = 0;
    }
    this.str = str;
    this.subStr = subStr;
    
  }
  

  public  void next( ) {
    int i = 0, j = 1;
    while (i < subStr.length()) {
      System.out.println(i + " <> " + j);

      if (subStr.charAt(i) != subStr.charAt(j)) {
        System.out.println(subStr.charAt(i) + " != " + subStr.charAt(j));
        if (i == 0)
          j++;
        else
          j = next[i];
      } else {
        System.out.println(subStr.charAt(i) + "  " + subStr.charAt(j));
        next[i] = ++j;
      }

      i++;
    }
  }

  public static void KMPsearch( ){
    
  }

  public static void  main(String[] args){
    String str = "cabdababaa";
    String sbuStr = "ababaa";
    KMP kmp = new KMP(str,sbuStr);
    kmp.next();
    System.out.println(Arrays.asList(next));
  }

}
