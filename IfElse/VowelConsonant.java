// 2) Write a Program to Check Whether a Character is Vowel or Consonant.
package IfElse;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch == 'a' || ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
