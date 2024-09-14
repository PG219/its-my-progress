package Recursion;

public class Recursion1 {

    

    public static void num(int n){

        if(n==0){
            return; //BaseCase
        }

        System.out.println(n); //Print
        num(n-1); //Recursion

    }

    public static void main(String[] args) {
        int n = 5;
        num(n);
    }


}