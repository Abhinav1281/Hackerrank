//package Hackerrank;

import java.io.*;
import java.util.*;

public class alicebob {
	static void compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> m = new ArrayList<>();
        m.add(0);
        m.add(0);
        for(int i=0;i<3;i++)
        {
            if(a.get(i)>b.get(i))
               m.set(0,(m.get(0)+1));
            if(a.get(i)<b.get(i))
               m.set(1,(m.get(1)+1));   
        }      
        System.out.println(m.get(0)+" "+m.get(1));

	}
	 public static void main(String[] args) throws IOException {
	       Scanner sc=new Scanner(System.in);
	       List<Integer> a=new ArrayList<>();
	       List<Integer> b=new ArrayList<>();
	       
	       for(int i=0;i<3;i++) {
	    	  a.add(0); 
	          a.set(i,sc.nextInt());
	       }  
	       for(int i=0;i<3;i++) {
		    	  b.add(0);
		          b.set(i,sc.nextInt());
		       }   
	       compareTriplets(a, b);
}
}