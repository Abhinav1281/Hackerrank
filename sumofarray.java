//package Hackerrank;
import java.io.*;


import java.util.*;


public class sumofarray {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar,int l) {
        int sum=0,i;
        for(i=0;i<l;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("Sum of the array="+sum);
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar,arCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
