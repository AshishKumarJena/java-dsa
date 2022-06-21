public class Variables {

    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        // sum x+y
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
        // difference x-y
        int difference = x - y;
        System.out.println("difference of " + x + " and " + y + " is " + difference);
        // product x*y
        int product = x * y;
        System.out.println("product of " + x + " and " + y + " is " + product);
        // division x/y y/x x%y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        // expression
        int expression = (x*y)/(x+y);
        System.out.println(expression);
    }
}
