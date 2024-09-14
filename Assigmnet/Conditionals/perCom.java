package Assigmnet.Conditionals;
import java.util.*;


public class perCom {
    public static int factorial(int n){

        int result =1;
        for (int i =1 ; i<=n; i++){
            result = i*result;

        }
        return result;



    }

    public static void perComb(int n , int r){

        if (n<r){
            System.out.println("Not valid");
            return;
        }
        int n1 = factorial(n);
        int r1  = factorial(r);
        int numMinusR = factorial(n-r);
        int permute = n1/numMinusR;
        int comb = n1/(r1*numMinusR);
        System.out.println(permute);
        System.out.println(comb);
        



        




    }


    public static void main(String[] args) {
        System.out.println("Permutation and Combination");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        perComb(n, r);
        sc.close();
    }


}
        