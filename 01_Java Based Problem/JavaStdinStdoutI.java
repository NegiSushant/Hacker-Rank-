import java.util.Scanner;

/*
Task -->> In this challenge, you must read 3 integers from stdin and then print them to stdout.
Each integer must be printed on a new line.

Input Format -->> There are  lines of input, and each line contains a single integer.

>>Sample Input
        42
        100
        125     */

public class JavaStdinStdoutI {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}