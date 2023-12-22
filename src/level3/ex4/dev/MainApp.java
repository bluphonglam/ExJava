package level3.ex4.dev;

import java.util.Scanner;

public class MainApp {
	
	static 	Scanner sc = new Scanner(System.in);
	
	//Ham nhap mang
	public static int [] input(int n) {
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap vao phan tu thu %d cua mang: ",i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	//Ham kiem tra so nguyen
	public static boolean isPrime(int n) {
		
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	
	//Ham dem so nguyen to
	public static int demSNT(int [] arr) {
		int dem = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				dem++;
			}
		}
		return dem;
	}
	//Ham thuc thi
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao so phan tu cua mang n = ");
		int n = sc.nextInt();
		
		int a[];
		
		a = input(n);
		System.out.println("Mang tren co so so nguyen to la: " +demSNT(a));
	}

}
