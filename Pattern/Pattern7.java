package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        for(int row =1 ; row <= 5; row++){
            
            for(int col = 1;col <= 5; col++){
                char ch = (char)('a' + (col-1));
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
