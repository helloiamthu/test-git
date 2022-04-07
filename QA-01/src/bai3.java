import java.util.Scanner;

public class bai3 {
//    Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        int Sum = 0;
        for(int i =0; i<=n; i++){
            if(i%2 ==0){
                Sum = Sum + i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den n la: " + Sum);
}
}
