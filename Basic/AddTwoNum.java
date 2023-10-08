// 3) Write a Program to Add Two Integer Numbers Entered by User
import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("The addition of two numbers : "+res);
        sc.close();
    }
}
