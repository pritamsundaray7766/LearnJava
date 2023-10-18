/*3) Write a Program to Generate Multiplication Table of a
number (entered by the user) using a for loop.
 */
package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int multiTable = sc.nextInt();

        for(int i =1 ; i <= 10; i++){
            
            System.out.println(multiTable + " * " + i + " = "+ multiTable * i);
        }
        sc.close();
    }
}
