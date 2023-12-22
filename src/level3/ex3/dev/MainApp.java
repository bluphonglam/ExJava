package level3.ex3.dev;

import java.util.Scanner;

public class MainApp {
	//tinh tong 1 + n^2/n!
	//Ham giai thua
	public static double giaiThua(double n) {
		double tich = 1;
		for (int i = 1; i <= n; i++) {
			tich *= i;
		}
		return tich;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		
		
		if (n >= 1) {
			double sum = 0;
			
			for (double i = 1; i <= n; i++) {
				sum += Math.pow(i, 2) / giaiThua(i);
			}
			
			System.out.println("Tong can tinh la: " +sum);
		} else {
			System.out.println("Vui long nhap n >= 1");
		}
	}

}
