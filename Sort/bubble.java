package Sort;

public class bubble {

    public static void printArray(int arr[]){

        for (int i =0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }

            


    }


    public static void main(String[] args) {


        

        int arr[] = {7,8,3,1,2};

        //bubble sort
        //time complexity = o(n^2)

        for(int j = 0; j<arr.length-1; j++){

            for(int i=0; i<arr.length-j-1;i++) {

                if(arr[i]>arr[i+1]){

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }

        printArray(arr);
    }
    
}
