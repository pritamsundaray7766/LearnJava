// 8) Write a Program to Multiply two decimal Numbers entered by User
import java.util.Scanner;

public class MultiplyDecimalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st decimal number : ");
        float num1 = sc.nextFloat();
         System.out.println("Enter 2nd decimal number : ");
        float num2 = sc.nextFloat();

        double res = num1 * num2;
        System.out.println("After Multiplication : " + res);
        sc.close();
    }
}
