package phamthanhhuong.com.test;

import phamthanhhuong.com.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg1=new TamGiac(8,12,15);
		System.out.println("Chu vi = "+tg1.tinhChuVi());
		System.out.println("Diện tích = "+tg1.tinhDienTich());
		
	}

}
