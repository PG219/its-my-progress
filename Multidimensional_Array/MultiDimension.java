package Multidimensional_Array;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2]; //rows and coloumns respectively .. there's not necessary to specify coloumn length.
        System.out.println(arr.length);//no of rows

        //input

        for (int row = 0; row < arr.length ; row++){
            for (int col = 0 ; col<arr[row].length; col++){
            arr[row][col] = in.nextInt();
            
        }

     }

        for (int row = 0; row < arr.length ; row++){
            for (int col = 0 ; col<arr[row].length; col++){
            System.out.print(arr[row][col] +" ");
            
        }

        System.err.println();


     }

    

        // int[][] arr2d = {
        //     {1,2,3}, //0th
        //     {4,5}, //1st
    
        //     {6,7,8,9} //2nd
            
    
        // };
    
        
    }




    
}
