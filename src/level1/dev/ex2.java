package level1.dev;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		/*
		 * Nhap vao do dai ba canh hinh tam giac, tinh chu vi dien tich
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao ba canh cua tam giac: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p-a) * (p-b) * (p-c)) * 2;
		
		System.out.println("Chu vi cua tam giac la: " +(p*2));
		System.out.println("Dien tich cua tam giac la: " +s);
	}
}
