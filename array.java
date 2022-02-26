import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n=sc.nextInt();
        System.out.println("Nhap phan tu cua mang: ");
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Mang la: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}