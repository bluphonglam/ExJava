package level2.dev;

import java.util.Scanner;

public class ex3 {
	/*
	 * nhap n, tinh tong 1 + .. + 1/can n
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		if (n >= 1) {
			double sum = 0;
			
			for (double i = 1; i <= n; i++) {
				sum += 1 / Math.sqrt(i);
			}
			
//			double test = 1 + (1/ Math.sqrt(2));
//			System.out.println(test);
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n >= 1");
		}
	}
}
