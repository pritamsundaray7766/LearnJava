package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int count = 1;
        for(int row = 1; row <= 5; row++){
            
            for(int col = 1; col <= 5; col++){
                
                System.out.print(count + " ");
                count++;
            }
           
            System.out.println();
             
        }
    }
}
