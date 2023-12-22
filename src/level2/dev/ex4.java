package level2.dev;

import java.util.Scanner;

public class ex4 {
	/*
	 * tinh tong: 	s = ... (n/can (n-1)*n) (de sai, n>1 vi mau so khac 0)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		if (n > 1) {
			double sum = 0;
			
			for (double i = 2; i <= n; i++) {
				sum += i / (Math.sqrt((i-1) * i));
			}
			
//			double test =  2/ (Math.sqrt((2-1) * 2));
//			System.out.println(test);
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n > 1");
		}
	}
}
