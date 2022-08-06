/*

https://www.hackerrank.com/challenges/solve-me-first/problem

Ques->>>>
        solveMeFirst has the following parameters:
            int a: the first value
            int b: the second value
        Returns
                the sum of a and b

 */

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        int a, b, sum;
        //System.out.println("Enter a and b ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        a = sc.nextInt();

        System.out.println("Please enter the second number: ");
        b = sc.nextInt();

        sum = (a+b);
        System.out.println("sum of "+a+" and "+b+" is: "+sum);

    }
}