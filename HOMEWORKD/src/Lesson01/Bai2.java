package Lesson01;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String MA_HOC_SINH = "2321050018";
		System.out.println("Nhập họ tên:");
		String name = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập giới tính:");
		char gTinh = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhập điểm trung bình:");
		double diem = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập học bổng:");
		boolean check = Boolean.parseBoolean(sc.nextLine());
		System.out.println("Nhập lớp:");
		String lop = sc.nextLine();
		System.out.println("Nhập số điện thoai:");
		String sdt = sc.nextLine();
		// output
		System.out.println("====== THÔNG TIN HỌC SINH =====");
		System.out.println("Họ tên: "+name);
		System.out.println("Mã học sinh: "+MA_HOC_SINH);
		System.out.println("Tuổi: "+age);
		System.out.println("Giới tính: "+gTinh);
		System.out.println("Điểm trung binh: "+ diem);
		System.out.println("Học bổng: "+ check);
		System.out.println("Lớp: "+ lop);
		System.out.println("Số điện thoại: "+sdt);

	}

}
