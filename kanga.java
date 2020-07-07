package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class kanga {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, final int v1, int x2, final int v2) {
        if (x1 > x2 && v1 < v2) {
            while (x2 <= x1) {
                if (x2 == x1) {
                    return "YES";
                }
                System.out.println(x1 + " " + x2);
                x2 += v2;
                x1 += v1;
            }
            return "NO";
        } else if (x1 < x2 && v1 > v2) {
            while (x1 <= x2) {
                if (x2 == x1) {
                    return "YES";
                }
                System.out.println(x1 + " " + x2);
                x2 += v2;
                x1 += v1;
            }
            return "NO";
        } else
            return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String[] x1V1X2V2 = scanner.nextLine().split(" ");

        final int x1 = Integer.parseInt(x1V1X2V2[0]);

        final int v1 = Integer.parseInt(x1V1X2V2[1]);

        final int x2 = Integer.parseInt(x1V1X2V2[2]);

        final int v2 = Integer.parseInt(x1V1X2V2[3]);

        final String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
