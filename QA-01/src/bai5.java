import java.util.Scanner;

public class bai5 {
    //Chương trình tính tổng của các chữ sô của 1 số nguyên n
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        n = sc.nextInt();
        while (n>0){
            soDu = n%10;
            n=n/10;
            tong += soDu;
        }
        System.out.println("Tong cac chu so cua so nguyen n: "+tong);
    }
}
