package Arrays;
import java.util.*;
public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        for (int i = 0 ; i<row; i++){

            for(int j = 0; j<col; j++){
    
                numbers[i][j]=sc.nextInt();
            }
           } 

           for (int i = 0 ; i<row; i++){

            for(int j = 0; j<col; j++){

                int x = sc.nextInt();

                if (numbers[i][j] == x){

                    System.out.println("Found" + j + i );

                }
    
                
            }
           } 

        




    }
    
}
