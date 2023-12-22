package level3.ex1.dev;

import java.util.Scanner;

public class MainApp {
	static 	Scanner sc = new Scanner(System.in);
	
	//Ham nhap mang
	public static int [] input(int n) {
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap vao phan tu thu %d cua mang: ",i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	//Ham sap xep tang dan
	public static int [] SortAsc(int [] arr) {
		int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
	}
	
	//Ham sap xep giam dan
	public static int [] SortDesc(int [] arr) {
		int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
	}
	
	//Ham in mang
	public static void printArr(int[] arr) {
		System.out.println("----------------");
		System.out.println("Cac phan tu cua mang bao gom: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		System.out.println();
	}
	
	//Ham thuc thi
	public static void main(String[] args) {	
		System.out.println("Nhap vao so phan tu cua mang n = ");
		int n = sc.nextInt();
		
		int a[];
		
		a = input(n);
		SortAsc(a);
		printArr(a);
		SortDesc(a);
		printArr(a);
		
	}
}
