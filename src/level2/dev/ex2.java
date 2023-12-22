package level2.dev;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		/*
		 * Nhap n, tinh Tong 1 + ... + Can n
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		if (n >= 1) {
			double sum = 0;
			
			for (double i = 1; i <= n; i++) {
				sum += Math.sqrt(i);
			}
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n >= 1");
		}
		
	}
}
