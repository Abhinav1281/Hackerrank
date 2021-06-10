//package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hourglassarrsum {



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++) {
           

            for (int j = 0; j < 6; j++) {
                
                a[i][j] = sc.nextInt();
            }
        }
        int maxsum=-999999;
        for(int i=0;i<4;i++)
        {
            for(int j=1;j<5;j++){

                int sum=0;
                
                
         sum=a[i][j]+a[i][j+1]+a[i][j-1]+a[i+1][j]+a[i+2][j+1]+a[i+2][j-1]+a[i+2][j];
                    if(sum>maxsum)
                        maxsum=sum;
                
            }
        }
        System.out.println(maxsum);

        sc.close();
    }
}

