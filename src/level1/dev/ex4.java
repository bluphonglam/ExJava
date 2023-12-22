package level1.dev;

import java.util.Iterator;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		//Nhap vao 4 so nguyen, kiem tra bao nhieu so chan le
		Scanner sc = new Scanner(System.in);
		
		int demChan = 0;
		int demLe = 0;
		
		System.out.println("Nhap vao 4 so nguyen: ");
		
		int a = sc.nextInt();
		if(a%2 == 0) demChan++; else demLe++;
			
		int b = sc.nextInt();
		if(b%2 == 0) demChan++; else demLe++;
		
		int c = sc.nextInt();
		if(c%2 == 0) demChan++; else demLe++;
		
		int d = sc.nextInt();
		if(d%2 == 0) demChan++; else demLe++;
		
		System.out.printf("Co %d so chan, Co %d so le",demChan, demLe);
		
	}
}
