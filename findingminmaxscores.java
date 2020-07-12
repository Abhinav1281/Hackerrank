package Hackerrank;
import basics.*;
public class findingminmaxscores {
	 static int[] breakingRecords(int[] scores) {
	        int min=scores[0],max=scores[0],mint=0,maxt=0;
	        for(int i=1;i<scores.length;i++)
	        {
	            if(scores[i]>max)
	            {
	                max=scores[i];
	                maxt++;
	            }
	            else if(scores[i]<min)
	            {
	                min=scores[i];
	                mint++;
	            }
	        }
	        int arr[]={maxt,mint};
	        return arr;

	    }
	 public static void main(String args[])
	 {
		 int arr[]=Arrayini.a();
		 int val[]=breakingRecords(arr);
		 System.out.println(val[0]+" "+val[1]);
		 
	 }
}
