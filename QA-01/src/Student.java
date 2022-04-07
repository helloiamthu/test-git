import java.util.*;

public class Student {
    public static void main(String[] args) {
        //       Bai 1
        double subtotal = 10.00;
        double shipping = 4.99;
        System.out.println("Enter your Discount code here: ");
        Scanner sc = new Scanner(System.in);
        String code_dashboard = sc.nextLine();
        System.out.println("Enter your Discount value:");
        Scanner sc1 = new Scanner(System.in);
        Float discount_value = sc1.nextFloat();
        String code_checkout = code_dashboard.toUpperCase();
        System.out.println("Discount code: "+ code_checkout +"         "+"-$" + discount_value);
        double total = subtotal - discount_value + shipping;
        System.out.println("Total: "+ total);
    }
}
