package Lesson02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ hai: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ ba: ");
		int c = Integer.parseInt(sc.nextLine());
		// gán max cho số thứ nhất
		int max = a;
		if( max > b && max > c) {
			System.out.println("Số lớn nhất: "+ max);
			
		}
		else if(max < b && b > c) {
			System.out.println("Số lớn nhất : "+ b);
		}
		else {
			System.out.println("Số lớn nhất: "+c);
		}
	}

}
