//package Hackerrank;
import java.util.*;;

public class anachk {
	
	static boolean isAnagram(String a, String b) {
        // Complete the fu
        a=a.toLowerCase();
        b=b.toLowerCase();
        char ar[]=a.toCharArray();
        char br[]=b.toCharArray();
       if(ar.length==br.length)
       {    
           int i;
           for(i=0;i<ar.length;i++)
           {
               for(int j=0;j<br.length;j++)
               {
                   if(ar[i]==br[j])
                   {
                       ar[i]='0';
                       br[j]='0';
                       break;
                   }
               }
              
           }
            int f=0;
            System.out.println(String.valueOf(ar)+"\t"+String.copyValueOf(br));
            for(i=0;i<ar.length;i++)
            {
                if(ar[i]!='0')
                {
                    f=1;
                    break;
                }

            }
            if(f==1)
                return false;
            else
                return true;
       }
       return false;
    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}



