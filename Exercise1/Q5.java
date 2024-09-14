package Exercise1;


/*Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 */

import java.util.*;


public class Q5 {

    public static void vote(int age){
        if (age>=18){

            System.out.println("Eligible");
        }
        else{
            System.out.println("Not");
        }

    



    }

    public static void main(String[] args) {
 
        System.out.print("Type your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);

        sc.close();
        


    }


    
}
