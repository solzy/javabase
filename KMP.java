
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
    int i = 0, j = -1;
    while (i < subStr.length() -1 ) {
      if ( j == -1 || subStr.charAt(i) == subStr.charAt(j)) {
	i++;
        j++;
	next[i] = j;
      } else {
	j = next[j];
      }
    }
  }

  public static void  main(String[] args){
    String str = "cabdababaa";
    String sbuStr = "ababaa";
    KMP kmp = new KMP(str,sbuStr);
    kmp.next();
    System.out.println(Arrays.asList(next));
  }

}
