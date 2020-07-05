package Hackerrank;

import basics.Arrayini;

public class minmaxsum {

	public static void main(String[] args) {
		int ar[]=Arrayini.a();
	
		miniMaxSum(ar,(ar.length));
	}
    static void miniMaxSum(int[] arr,int s) {
        int min=0,max=0;
        int i,tempmin=0,tempmax=0;
        for(i=1;i<s;i++)
        {
           if(arr[i]<arr[tempmin])
                tempmin=i;
            if(arr[i]>arr[tempmax])
                tempmax=i;    
            
        }
        for(i=0;i<s;i++)
        {
            if(i!=tempmin)
                max+=arr[i];
            if(i!=tempmax)      
                min+=arr[i];
        }
        System.out.println(min+" "+max);
    }
}
