/*

https://www.hackerrank.com/challenges/simple-array-sum/problem

Given an array of integers, find the sum of its elements.
For example, if the array arr = [1, 2, 3], 1+2+3=6, so return 6.

Function Description
        Complete the simpleArraySum function in the editor below.
        It must return the sum of the array elements as an integer.

        simpleArraySum has the following parameter(s):
            ar: an array of integers

Input Format:
            The first line contains an integer, n, denoting the size of the array.
            The second line contains n space-separated integers representing the array's elements.

Constraints: ->> 0 < n, ar[i] <= 1000;

Output Format:-->>
            Print the sum of the array's elements as a single integer.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the Array: ");
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.set(i, sc.nextInt());  // not take the Arrays in list so this may be wrong
                                        // but solution is right.

        }
        System.out.println("Sum of the list is: "+simpleArraySum(ar));
    }
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i : ar)
        {
            sum += i;
        }
        return sum;
    }
}