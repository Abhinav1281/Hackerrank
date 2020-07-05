package Hackerrank;


	
	import java.util.*;

	

	public class HashStaircase {

	    // Complete the staircase function below.
	    static void staircase(int n) {
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n-i;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("#");
	            }
	            System.out.println();
	        }


	    }

	    

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	       

	        staircase(n);
	        sc.close();

	        
	    }
	}



