import java.util.Scanner;

public class ParseInt {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = (scn.nextLine());

        System.out.println("Hello " + name + ". Here is the counting");

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        scn.close();
    }
}
