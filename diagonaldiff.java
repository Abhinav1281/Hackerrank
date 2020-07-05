package Hackerrank;


import java.util.*;
public class diagonaldiff {
	public static int diagonalDifference(List<List<Integer>> arr) {
        int i,j,sum1=0,sum2=0;
        for(i=0;i<arr.size();i++)
        {
            for(j=0;j<arr.size();j++)
            {
                if(i==j)
                    sum1+=arr.get(i).get(j);
                if(j==(arr.size()-1-i))
                    sum2+=arr.get(i).get(j);
            }
        }
        int diff=sum1-sum2;
        diff=Math.abs(diff);
        return diff;
    }
}


