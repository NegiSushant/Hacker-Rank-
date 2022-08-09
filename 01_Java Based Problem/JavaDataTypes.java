/*
Task-->>>
        Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise,
        we'll work with the primitives used to hold integer values (byte, short, int, and long):
                1) A byte is an 8-bit signed integer.
                2) A short is a 16-bit signed integer.
                3) An int is a 32-bit signed integer.
                4) A long is a 64-bit signed integer.
        Given an input integer, you must determine which primitive data types are capable of properly storing that input.

        To get you started, a portion of the solution is provided for you in the editor.

Input Format-->>
        The first line contains an integer,T, denoting the number of test cases.
        Each test case,T, is comprised of a single line with an integer, T, which can be arbitrarily large or small.

Output Format-->>
            For each input variable n and appropriate primitive data type, you must determine if the given primitives
            are capable of storing it. If yes, then print:
                        n can be fitted in:
                        * dataType

If there is more than one appropriate data type, print each one on its own line and order them by size
(i.e.:byte < short < int < long ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:
                >>>n can't be fitted anywhere.
Sample Input-->>>
            5
            -150
            150000
            1500000000
            213333333333333333333333333333333333
            -100000000000000
Sample Output
            -150 can be fitted in:
            * short
            * int
            * long
            150000 can be fitted in:
            * int
            * long
            1500000000 can be fitted in:
            * int
            * long
            213333333333333333333333333333333333 can't be fitted anywhere.
            -100000000000000 can be fitted in:
            * long
 */

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x == (byte)x)System.out.println("* byte");
                if(x == (short)x)System.out.println("* short");
                if(x == (int)x)System.out.println("* int");
                if(x == (long)x)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }
}