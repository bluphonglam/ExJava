package level1.dev;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		/*
		 * Nhap diem trung binh, thong bao hoc luc sinh vien
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap diem trung binh");
		double dtb = scan.nextDouble();
		
		if ((dtb >= 0) && (dtb < 6.5)) {
			System.out.println("Hoc luc cua ban la trung binh");
		} else if ((dtb >= 6.5) && (dtb < 8)) {
			System.out.println("Hoc luc cua ban la kha");
		}else if((dtb <= 10) && (dtb >=8)) {
			System.out.println("Hoc luc cua ban la gioi");
		}else {
			System.out.println(" Diem trung binh phai tu 0 -> 10");
		}
	}
}
