package level1.dev;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kiem tra 3 so nguyen co phai la mot canh cua tam giac
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap theo thu tu ba canh cua tam giac");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a+b > c && a+c > b && b+c > a) {
			System.out.printf("Ba canh %d, %d, %d thoa man la ba canh cua tam giac!",a,b,c);
		}else {
			System.out.printf("Ba canh %d, %d, %d khong thoa man la ba canh cua tam giac!",a,b,c);
		}
	}

}
