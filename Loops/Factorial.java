/*2) Write a Program to Find Factorial of a given number N
(N is entered by user)
 */
package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int multi = 1;
        for(int i =1; i <= N; i++){
            multi *= i;
        }
        System.out.println(multi);
    }
}
