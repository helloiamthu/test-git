import java.util.Scanner;

public class bai7 {
    //Nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự giảm dần.
    public static void main(String[] args) {
        int n, i,j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for (i=0; i<n; i++){
            System.out.println("Phan tu thu "+ (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        for(i=0; i< n-1 ; i++){
            for(j=0; j< n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ket qua sau khi sap xep theo thu tu giam dan la: ");
        for(i=0;i <n; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
