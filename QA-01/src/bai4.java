import java.util.Scanner;

public class bai4 {
    //    Viết chương trình tính giai thừa của n.
    public static void main(String[] args) {
        System.out.println("Nhap vao so n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gt = 1;
        if (n == 0 || n == 1) {
            System.out.println("n! = 1");
        } else {
            for (int i = 2; i <= n; i++) {
                gt = gt * i;
            }
            System.out.println("n! = " + gt);
        }
    }
}
