//package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class treeproblem {




    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(final int s, final int t, final int a, final int b, final int[] apples, final int[] oranges) {
            int i=0,fp=0,na=0,no=0;
            for(i=0;i<apples.length;i++)
            {
                fp=a+apples[i];
                if(fp>=s && fp<=t)
                    na++;
            }
            for(i=0;i<oranges.length;i++)
            {
                fp=b+oranges[i];
                if(fp>=s && fp<=t)
                    no++;
            }
            System.out.println(na+"\n"+no);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final String[] st = scanner.nextLine().split(" ");

        final int s = Integer.parseInt(st[0]);

        final int t = Integer.parseInt(st[1]);

        final String[] ab = scanner.nextLine().split(" ");

        final int a = Integer.parseInt(ab[0]);

        final int b = Integer.parseInt(ab[1]);

        final String[] mn = scanner.nextLine().split(" ");

        final int m = Integer.parseInt(mn[0]);

        final int n = Integer.parseInt(mn[1]);

        final int[] apples = new int[m];

        final String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            final int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        final int[] oranges = new int[n];

        final String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

    
