import java.io.*;
import java.util.*;

class QueenAttResult {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obs) {
    int iflag=0,jflag=0,count=0;
    if(n==1)
    return 0;
   //first

   for(int i=c_q-1,j=c_q+1;i>0 || j<=n;i--,j++)
   {
        if(i>0)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(r_q);
            pos.add(i);

            if(iflag==1 || obs.contains(pos))
                iflag=1;
            else
            {
                System.out.println("\n"+r_q+"->"+i);
                count++;
            }
        }

        if(j<=n)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(r_q);
            pos.add(j);

            if(jflag==1 || obs.contains(pos))
                jflag=1;
            else
            {
                System.out.println(r_q+"->"+j);
                count++;
            }
        }
   }

   //second
   iflag=0;jflag=0;
   for(int i=r_q-1,j=r_q+1;i>0 || j<=n;i--,j++)
   {
        if(i>0)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(i);
            pos.add(c_q);

            if(iflag==1 || obs.contains(pos))
                iflag=1;
            else
            {
                System.out.println("\n"+i+"->"+c_q);
                count++;
            }
        }

        if(j<=n)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(j);
            pos.add(c_q);

            if(jflag==1 || obs.contains(pos))
                jflag=1;
            else
            {
                System.out.println(j+"->"+c_q);
                count++;
            }
        }
   }

   //third
   iflag=0;jflag=0;
   for(int i=c_q-1,j=c_q+1,x=r_q+1,y=r_q-1;(i>0 || j<=n)&&(x<=n || y>0);i--,j++,x++,y--)
   {
       if(x<=n){
        if(i>0)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(x);
            pos.add(i);

            if(iflag==1 || obs.contains(pos))
                iflag=1;
            else
            {
                System.out.println("\n"+x+"->"+i);
                count++;
            }
        }

        if(j<=n)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(x);
            pos.add(j);

            if(jflag==1 || obs.contains(pos))
                jflag=1;
            else
            {
                System.out.println(x+"->"+j);
                count++;
            }
        }
    }
    if(y>0)
    {
        
    }
   }

   //fourth
   iflag=0;jflag=0;
   for(int i=c_q-1,j=c_q+1,x=r_q-1;(i>0 || j<=n)&&x>0;i--,j++,x--)
   {
        if(i>0)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(x);
            pos.add(i);

            if(iflag==1 || obs.contains(pos))
                iflag=1;
            else
            {
                System.out.println("\n"+x+"->"+i);
                count++;
            }
        }

        if(j<=n)
        {
            List<Integer> pos=new ArrayList<>();
            pos.add(x);
            pos.add(j);

            if(jflag==1 || obs.contains(pos))
                jflag=1;
            else
            {
                System.out.println(x+"->"+j);
                count++;
            }
        }
   }
    
    return count;
}

}

public class QueenAtt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> obstaclesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowTempItems[j]);
                obstaclesRowItems.add(obstaclesItem);
            }

            obstacles.add(obstaclesRowItems);
        }

        int result = QueenAttResult.queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println("\nResult="+result);
        bufferedReader.close();
    }
}
