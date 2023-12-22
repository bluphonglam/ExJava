package level2.dev;

import java.util.Scanner;

public class ex5 {
	/*
	 * Tinh tong: 1 + ... + (n+1)/can n , n>=2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		if (n >= 2) {
			double sum = 1;
			
			for (double i = 2; i <= n; i++) {
				sum +=  ((i + 1) / Math.sqrt(i));
			}
			
//			double test =  1 + ((2 + 1) / Math.sqrt(2));
//			System.out.println(test);
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n >= 2");
		}
	}
}
