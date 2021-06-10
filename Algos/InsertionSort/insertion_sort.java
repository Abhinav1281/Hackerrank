package Algos.InsertionSort;

import java.util.*;

public class insertion_sort {
    /*
    The code below is used to sort a linked list using insertiom sort */
    public static void insertionSortList(int n, List<Integer> arr) 
    {
        List<Integer> s=new LinkedList<>();
        s.add(arr.get(0));
        arr.remove(0);
        while(arr.size()>0)
        {
            int cval=arr.get(0);
            arr.remove(0);
            s=addSort(s,cval);
            printAr(s,arr);
        }
    }
    
    public static void printAr(List<Integer> s,List<Integer> us)
    {
        for(int i:s)
            System.out.print(i+" ");
        //System.out.print(":");
        for(int i:us)
            System.out.print(i+" ");
            
        System.out.println();
    }
    public static List<Integer> addSort(List<Integer> s,int val)
    {
        int i=s.size();
        if(s.size()==1){
            if(val>s.get(0))
                s.add(val);
            else
                s.add(0,val);
            return s;
        }
        s.add(-1);
        while(val<=s.get(i-1))
        {
            s.set(i,s.get(i-1));
            i--;
            if(i<=0)
                break;
        }
        s.set(i,val);
        return s;
    }
     /*
    The code below is used to sort a Array using insertiom sort */
   
    public static void insertionSortArray(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            // printArray(A);
            // System.out.print(":");
            while(j >=0 && A[j] > value){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = value;
            // printArray(A);
            // System.out.println();
        }

        printArray(A);
    }

    private static void printArray(int[] a) 
    {
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
    
}
