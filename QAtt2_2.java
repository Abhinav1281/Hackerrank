import java.io.*;
import java.util.*;

class QAttResult {

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

    public static int queensAttack(int n, int kE, int r_q, int c_q, List<List<Integer>> obs) 
    {
        int count=0;
        int moves[][] = new int[][] {{1, -1},{1,  0},{1, +1},{ 0, -1},{ 0, +1},{-1, -1},{-1,  0},{-1, +1}};

        for(int k=0;k<8;k++)
        {
            for(int i=r_q+moves[k][0],j=c_q+moves[k][1];(i<=n && i>0) && (j<=n && j>0);i+=moves[k][0],j+=moves[k][1])
            {
                List<Integer> pos=new ArrayList<>();
                pos.add(i);
                pos.add(j);
                if(obs.contains(pos))
                    break;
                else
                {
                    count++;
                    System.out.println(i+"->"+j);
                }
            }
            System.out.println();
        }    
    
    return count;

}

}

public class QAtt2_2 {
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

        int result = QAttResult.queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println("\nResult="+result);
        bufferedReader.close();
    }
}
