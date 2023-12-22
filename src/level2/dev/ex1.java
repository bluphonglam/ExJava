package level2.dev;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		/*
		 * Viet chuong trinh tinh tong  1 + 1/2^2 + ... + 1/n^2
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		
		if (n >= 1) {
			double sum = 0;
			
			for (double i = 1; i <= n; i++) {
				sum += 1 / (i * i);
			}
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n >= 1");
		}
	
	}
}
