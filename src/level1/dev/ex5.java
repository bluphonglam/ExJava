package level1.dev;

import java.util.Scanner;
/*
 * Nhap vao so dien, tinh tien dien
 */

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so dien tieu dung: ");
		int soDien = sc.nextInt();
		
		int sum = 0;
		
		if ((soDien > 0 ) && (soDien <= 100)) {
			sum = soDien * 1800;
		}else if ((soDien >= 101 ) && (soDien <= 200)) {
			sum = (100 * 1800) + ((soDien - 100) * 2500);
		}else if (soDien > 200){
			sum = (100 * 1800) + (100 * 2500) + ((soDien - 200) * 3000);
		}
		
		if(soDien > 0) {
			System.out.println("Tien dien phai dong la: " +sum);
		}else {
			System.out.println("Vui long nhap so dien > 0");
		}
	}
}
