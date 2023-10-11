package Pattern;

/*
 1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
 */

public class Print1toNPattern2 {
    public static void main(String[] args) {
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= 4; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
