package Arrays;
import java.util.*;

public class Linearalgorithm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[]= new int[size];
        for(int i =0; i<size; i++){

            int number = sc.nextInt();
            numbers[i]= number;

        }

        int x  = sc.nextInt();
        sc.close();

        for(int j = 0; j<size; j++){
            if(numbers[j]==x){
                System.out.println("x found at index : " + j);
            }      ;
        }


    }


    
}
