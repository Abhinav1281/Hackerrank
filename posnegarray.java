//package Hackerrank;
import java.io.*;

public class posnegarray {
    
    // Complete the plusMinus function below.
     static void plusMinus(int[] ar,int n) {
        double arf[]={0,0,0};
         for(int i=0;i<n;i++)
        {
               if(ar[i]>0)
                   arf[0]++;
               else if(ar[i]<0)
                   arf[2]++;
               else
                   arf[1]++;        
           }
           System.out.println((arf[0]/n));
           System.out.println((arf[2]/n));
           System.out.println((arf[1]/n));
       }

       public static void main(String args[]) {
        try{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int ar[]= new int [n];
        for(int i=0;i<n;i++){
            System.out.println("value=");
            ar[i]=Integer.parseInt(in.readLine());

        }
        plusMinus(ar, n);
    }
    catch(Exception e){}
    
    
}
}