package automation.testsuite;

import java.util.Scanner;

public class Day7_BTVN {

	
	public String name;
	Scanner scanner = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[doDaiMang];
		for (int i = 0; i < doDaiMang; i++) {
			System.out.println("Nhập tên nhân viên của mảng ở vị trí thứ: " + i);
			name[i] = scanner.nextLine();

		}
		inMang(name);
		
	}

	public static void inMang(String[] name) {
		System.out.println("Các tên nhân viên của mảng vừa nhập là: ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
	}
	public static void main(String[] args) {
		nhapMang(3);

	}

}
