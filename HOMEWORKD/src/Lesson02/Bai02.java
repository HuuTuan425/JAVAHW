package Lesson02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm trung bình:");
		double diem = Double.parseDouble(sc.nextLine());
		if(diem < 0 || diem > 10) {
			System.out.println("Điểm không hợp lệ !");
		}
		else if (diem >= 9) {
			System.out.println("Xuất sắc");
		}
		else if( diem >= 8) {
			System.out.println("Giỏi");
		}
		else if(diem >=7) {
			System.out.println("Khá");
		}
		else if(diem >=5) {
			System.out.println("Trung bình");
		}
		else {
			System.out.println("Yếu");
		}
	}

}
