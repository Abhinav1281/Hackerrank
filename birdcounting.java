//package Hackerrank;
import java.util.*;
import basics.*;
public class birdcounting {

	
		static int migratoryBirds(List<Integer> arr)
		{
	        int valarr[]={0,0,0,0,0};
	        for(int i=0;i<arr.size();i++)
	        {
	            valarr[(arr.get(i)-1)]++;
	        }
	        int min=1;
	        for(int i=1;i<5;i++)
	        {
	            if(valarr[i]>valarr[(min-1)])
	                min=i+1;
	        }
	        return min;


	    }

		public static void main(String[] args) 
		{
			List<Integer> ll = Arraylistini.input();
			int val=migratoryBirds(ll);
			System.out.println(val);

}
}
