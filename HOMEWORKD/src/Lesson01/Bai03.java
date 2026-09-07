package Lesson01;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MA_THIET_BI = 422005;
		System.out.println("Nhập tên thiết bị: ");
		String name = sc.nextLine();
		System.out.println("Nhập hãng sản xuất: ");
		String hang = sc.nextLine();
		System.out.println("Nhập số lượng: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập giá của 1 sản phẩm: ");
		double gia = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập năm sản xuất:");
		String nam = sc.nextLine();
		System.out.println("Nhập trọng lượng: ");
		double trongLuong = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập phiên bản: ");
		char phienBan = sc.next().charAt(0);
		// OUT 
		System.out.println("======= THÔNG TIN THIẾT BỊ ======");
		System.out.println("Tên thiết bị: "+ name);
		System.out.println("Hãng sản xuất: "+ hang);
		System.out.println("Số lượng: "+ soLuong);
		System.out.println("Giá 1 sản phẩm: "+ gia);
		System.out.println("Năm sản xuất: "+ nam);
		System.out.println("Trọng lượng sản phẩm: "+ trongLuong);
		System.out.println("Mã thiết bị: "+MA_THIET_BI);
		System.out.println("Phiên bản: "+ phienBan);
		

	}

}
