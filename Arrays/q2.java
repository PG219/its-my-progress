package Arrays;
import java.util.*;




public class q2 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] BS = new int[size];
        System.out.println("------------------");
    
        for (int i = 0; i<size; i++){
            BS[i] = sc.nextInt();


        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
  

        for (int i = 0; i<size; i++){
            if(BS[i] < min){
                min = BS[i];

            }

            if(BS[i]> max){

                max = BS[i];
    


            }





        }

        System.out.println(min);
        System.out.println(max);

    

        
        
    }


    
}
