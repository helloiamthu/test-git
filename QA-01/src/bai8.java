import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    //    Viết chương trình nhập vào mảng A có n phần tử, các phần tử là số nguyên lớn hơn 0 và nhỏ hơn 100. Thực hiện các chức năng sau:
//    a) Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu tiên tìm được).
//    b) Sắp xếp mảng theo thứ tự tăng dần.
//    c) Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính tăng dần cho mảng
    public static int nhap(){
        Scanner sc= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= sc.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return (n);
    }
    public static int viTriMax1(int a[], int n){
        int max= a[0];
        int key= 0;
        for(int j=0 ; j<n ; j++){
            if(max<a[j]){
                max= a[j];
                key= j;
            }
        }
        return (key);
    }
    public static void inArray(int[] a, int begin , int end){
        System.out.println();
        int i;
        for(i=begin ; i<end ; i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public static int viTriMax2(int[] a,int n){
        int i,key=0,Max2=0;
        for(i=0 ; i<n ; i++){
            if(a[i]>Max2 && a[i]!= a[viTriMax1(a, n)]){
                Max2= a[i];key= i;
            }
        }return (key);
    }
    public static void themPhanTu(int[] a,int n,int pt){
        a[0]= pt;
        Arrays.sort(a);
    }
    public static void main(String[] args) {
        System.out.print("Nhap n= ");
        int n= nhap();
        int[] a= new int[n+1];
        int i;
        for(i=0 ; i<n ; i++){
            System.out.print("\n Nhap phan tu thu "+i+" = ");
            a[i]= nhap();
        }
        for(i=0 ; i<n ; i++){
            if(a[i]== a[viTriMax1(a, n)])
                System.out.println(" Phan tu thu "+i+" lon thu nhat trong mang a["+i+"]= "+a[i]);
        }
        for(i=0 ; i<n ; i++){
            if(a[i]== a[viTriMax2(a, n)])
                System.out.println(" Phan tu thu "+i+" lon thu 2 trong mang a["+i+"]= "+a[i]);
        }
        System.out.println("Day sau khi sap xep tang dan:");
        Arrays.sort(a);
        inArray(a,1,n+1);
        System.out.print("Nhap phan tu muon them pt= ");
        int pt= nhap();
        System.out.println("Day sau khi sap xep tang dan:");
        themPhanTu(a,n+1,pt);
        inArray(a,0,n+1);
    }
}