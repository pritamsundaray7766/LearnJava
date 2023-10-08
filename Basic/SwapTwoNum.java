//6) Write a Program to Swap Two Numbers

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);
        sc.close();
    }
}
