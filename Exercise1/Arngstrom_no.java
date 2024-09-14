package Exercise1;
import java.util.Scanner;

public class Arngstrom_no {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();

        System.out.println(isArmstrong(a));

        for(int i =1 ; i <1788490 ; i++){

            if(isArmstrong(i)){
                System.out.println(i);
            }
            



        }
        




        

    }

    public static boolean isArmstrong(int a){
        int original = a;
        int sum = 0;
        while (a>0){
            int rem = a%10;
            int cube = rem*rem*rem;
            sum+=cube;
            a = a/10;
         }

         return sum == original;

        
         }


         
 
    }

    
    

