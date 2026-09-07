package Lesson02;

import java.util.Scanner;

public class Bai01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập năm: ");
		int year = Integer.parseInt(sc.nextLine());
		if(year % 400 == 0 && (year % 100 != 0 || (year % 4 ==0) )){
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}

	}

}
