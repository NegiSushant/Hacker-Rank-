// https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

/*
Task->> Given an integer, n, perform the following conditional actions:
                1)>> If n is odd, print Weird.
                2)>> If n is even and in the inclusive range of 2 to 5, print Not Weird.
                3)>> If n is even and in the inclusive range of  6 to 20, print Weird.
                4)>> If n is even and greater than 20, print Not Weird.
        Complete the stub code provided in your editor to print whether n is weird or not weird.

Input Format-->> A single line containing a positive integer, .

Constraints>> 1<= n <= 100,

Output Format>> Print Weird if the number is Weird; otherwise, print Not Weird.

Sample Input 0>>> 3,        Sample Output 0>>> Weird
Sample Input 1>> 24,        Sample Output 1>>> Not Weird
*/

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        if(n % 2 != 0){
            System.out.println("Weird");
        }
        if (n % 2 == 0){
            if (2 <= n && n <= 5){
                System.out.println("Not Weird");
            }
            if ( 6 <= n && n <= 20){
                System.out.println("Weird");
            }if(n > 20){
                System.out.println("Not Weird");
            }
        }
    }
}