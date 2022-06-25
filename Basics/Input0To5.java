package Basics;
import java.util.Scanner;

public class Input0To5 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
