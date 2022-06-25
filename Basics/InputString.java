package Basics;
import java.util.Scanner;

public class InputString {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        scn.close();
        System.out.println("Hello " + n);
        
    }
}
