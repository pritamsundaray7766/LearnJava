/*3) Write a Program to Find Largest Number Among Three
Numbers entered by users */
package IfElse;

import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three numbers : ");
        int num1 = sc.nextInt();
         int num2 = sc.nextInt();
          int num3 = sc.nextInt();

          if(num1 > num2 && num2 > num3){
            System.out.println("The largest number is : " + num1);
          }else if(num2 > num1 && num2 > num3){
             System.out.println("The largest number is : " + num2);
          }else{
             System.out.println("The largest number is : " + num3);
          }
          sc.close();
    }
}
