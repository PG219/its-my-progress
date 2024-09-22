package Strings;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Pranay   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
