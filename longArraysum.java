import java.io.*;
public class longArraysum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(int[] ar,int l) {
        long sum=0;
        for(int i=0;i<l;i++)
        {
            sum+=ar[i];
        }
        System.out.println("Sum="+sum);
        return sum;


    }

    public static void main(String args[]) {
        try{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int l=Integer.parseInt(in.readLine());
        int ar[]= new int [l];
        for(int i=0;i<l;i++){
            System.out.println("value=");
            ar[i]=Integer.parseInt(in.readLine());

        }
        long sum= aVeryBigSum(ar, l);
        System.out.println(sum);
    }
    catch(Exception e){}
}
}
