import java.util.Scanner;

public class bai6 {
    //Tìm số thuận nghịch của 1 số nguyên
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_daonguoc =0;
        System.out.println("Nhap vao so can tim so thuan nghich: ");
        int n = sc.nextInt();
        while (n!=0){
            int n1 = n%10;
            n_daonguoc = n_daonguoc * 10 + n1;
            n /=10;

        }
        System.out.println("So thuan nghich cua n la: "+n_daonguoc);
    }
}
