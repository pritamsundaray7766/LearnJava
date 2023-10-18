// 1) Write a Program to Check Whether Number is Even or Odd
package IfElse;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
           check();
       
    }
    static void check(){
      Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
