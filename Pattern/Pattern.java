package Pattern;
import java.util.*;

public class Pattern {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){

                if (i==1||i==n||j==1||j==n){

                    System.out.print("*");

    
                } else{ 
                    System.out.print(" ");}
            }

            System.out.println(" ");
        }
        sc.close();

    



        



    }























}
  






 
    
        



































        //Filled rectangle
       /*
        for (int i = 0; i<5; i++){

            for (int j = 1; j<=5; j++){

              System.out.print("*");



            }
            
            System.out.println(" ");



        }
            */

//Hollow
        /*int m=5;

        int n = 4;
        for (int i=1 ; i<=m; i++){

            for (int j=1; j<=n; j++){

                if( i==1 || i==m|| j==1 || j==n){

                    System.out.print("*");
                } else{
                    
                    
                }

        
            }

            System.out.println("");
        }
        */
//Half Triangle

       /*  for (int i=1; i<=4; i++ ){


            for(int j=1; j<=i; j++){

                System.out.print("*");





            }

            System.out.println(" ");
        }
            */

//Half Triangle(inverted)
        /*for (int i=4; i>=1; i--){

            for (int j = 1; j<=i; j++){

                System.out.print("*");

            }

            System.out.println(" "); */


            



            


        



        
        



        


        




        



    

