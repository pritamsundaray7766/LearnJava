// 7) Write a Program to Find ASCII Value of a Character

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character : ");
        String  str = sc.nextLine();
        char ch = str.charAt(0);

        int asc = ch;

        System.out.println(asc);
        sc.close();


    }
    
}
