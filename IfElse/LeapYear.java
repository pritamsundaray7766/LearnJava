/*
 * 5) Write a Program to Check whether a year entered by user is Leap Year or not
 */
package IfElse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if(((year % 4 == 0 && year % 100 != 0 )) || year % 400 == 0) {
            System.out.println("Leap");
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
