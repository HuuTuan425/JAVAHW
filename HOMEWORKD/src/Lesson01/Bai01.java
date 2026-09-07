package Lesson01;

import java.util.Scanner;

public class Bai01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		String nameSP = sc.nextLine();
		System.out.println("Nhập hãng sản xuất:");
		String nameHang = sc.nextLine();
		System.out.println("Nhập màu sắc:");
		String color = sc.nextLine();
		System.out.println("Nhập giá:");
		double gia = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập số lượng tồn kho: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập trạng thái còn hàng: ");
		boolean trangThai = Boolean.parseBoolean(sc.nextLine());
		System.out.println("Nhập đánh gía sản phẩm:");
		Double danhGia = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập nhóm sản phẩm:");
		char nhom = sc.next().charAt(0);
		// in ra 
		System.out.println("Tên sản phẩm: "+nameSP);
		System.out.println("Hãng sản xuẩt: "+ nameHang);
		System.out.println("Màu sắc: "+color);
		System.out.println("Giá: "+ gia);
		System.out.println("Số lượng tồn kho: "+ soLuong);
		System.out.println("Trạng thái: "+trangThai);
		System.out.println("Đánh giá: "+ danhGia);
		System.out.println("Nhóm sản phẩm: "+ nhom);
		
		
		

	}

}
