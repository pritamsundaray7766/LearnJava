package Pattern;

// a a a a a 
// b b b b b 
// c c c c c 
// d d d d d 
// e e e e e 

public class Pattern6 {
    public static void main(String[] args) {
        for(char row = 'a'; row <= 'e' ; row++){
            for(int col = 1; col <= 5 ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
