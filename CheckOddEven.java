import java.util.Scanner;

public class CheckOddEven {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2==0) {
            System.out.println(n + " is even.");
        }
        else {
            System.out.println(n + " is odd.");
        }
        System.out.println("Hard Work is better than Smart Work");
        scn.close();
    }
}
