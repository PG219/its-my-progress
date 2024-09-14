package Strings;

public class palindrome {

    public static boolean Palin(String a){
        if (a == null || a.length() == 0){
           return true; 
        }
        
        
        a = a.toLowerCase();
        
        int n= a.length();
        
        for (int i =0 ; i<=n/2; i++){
           char start =  a.charAt(i) ;
           char end = a.charAt(n-i-1);

           if (start != end){
            return false;
           }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "abcba";
        System.out.println(Palin(str));


    }
    
}
