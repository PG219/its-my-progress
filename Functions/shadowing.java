package Functions;

public class shadowing {

    static int x = 90;//this can be used in whole class
    

    public static void main(String[] args) {
        System.out.println(x);
        int x = 80;
        System.out.println(80);


        
    }
}
