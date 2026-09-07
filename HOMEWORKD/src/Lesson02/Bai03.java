package Lesson02;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ 2: ");
		int b = Integer.parseInt(sc.nextLine());
		if( a == 0 ) {
			if(b == 0 ) {
				System.out.println("Phương trình vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.println("Phương trình có nghiệm: "+ (-b/a));
		}
 
	}

}
