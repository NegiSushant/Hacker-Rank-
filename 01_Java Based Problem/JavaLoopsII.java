/*
Task--->>>
          We use the integers a, b, and n to create the following series:

          (a + 2^0*b)(a + 2^0 * b + 2^1 * b)...........(a + 2^0 * b + 2^1 * b + .... + 2^(n-1) * b)

          You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the
          given a, b, and n values as a single line of n space-separated integers.

Input Format--->>>
            The first line contains an integera, q, denoting the number of queries.
            Each line i of the q subsequent lines contains three space-separated integers describing the respective ai,
             bi, and ni values for that query.


Output Format--->>>>
              For each query, print the corresponding series on a new line. Each series must be printed in order as
              a single line of n space-separated integers.

Sample Input-->>>
                    2
                    0 2 10
                    5 3 5
Sample Output-->>>
            2 6 14 30 62 126 254 510 1022 2046
            8 14 26 50 98
 */

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        int t, a, b, n;
        int sum;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of queries: ");
        t=in.nextInt();

        for(int i=0; i<t; i++)
        {
            System.out.println("Enter the first number: ");
            a = in.nextInt();
            System.out.println("Enter the second number: ");
            b = in.nextInt();
            System.out.println("Enter the number of term: ");
            n = in.nextInt();
            sum = a;

            for (int j=0; j<n; j++)
            {
                int nextEle = (int)Math.pow(2, j)*b;
                sum = sum + nextEle;
                System.out.printf("%s ",sum);
            }
            if (i < t-1)
            {
                System.out.print("\n");
            }

        }
        in.close();
    }
}