/*1) Write a Program to Calculate Sum of first N Natural
Numbers (here value of N is Entered by user)
 */
package Loops;

import java.util.Scanner;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N here : ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum = sum +  i;
        }
        System.out.println(sum);

    }
}
