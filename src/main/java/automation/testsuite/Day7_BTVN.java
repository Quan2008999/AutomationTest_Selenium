package automation.testsuite;

import java.util.Scanner;

public class Day7_BTVN {

	
	private String name, phone, id;
	private int  age;
	Scanner scanner = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int soNV = scanner.nextInt();
		System.out.println("--------------Nhập thông tin nhân viên---------------------");
		for(int i=0;i<soNV;i++) {
			System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ": ");
			System.out.println("Chọn nhân viên thuộc phòng ban: \n1 - Developer\n2 - Tester\n3 - BA");
			
			nhap();
			
			}
		System.out.println("--------------Xuất thông tin nhân viên---------------------");
		for(int i=0;i<soNV;i++) {
			employee[i].xuat();
			System.out.println("\n");
		}

	}

}
