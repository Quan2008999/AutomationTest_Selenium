package automation.testsuite;

import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day7_BTVN {

	private String name, phone;
	private int id, age;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@BeforeMethod
	public void openBrower() {
		System.out.println("This method to open chrome brower");
	}
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	public void inputData() {
		System.out.print("name:");
		name = sc.nextLine();
		System.out.print("phone:");
		phone = sc.nextLine();
		System.out.print("id:");
		id = sc.nextInt();
		System.out.print("age:");
		age = sc.nextInt();
	}
	public String print() {
		return "ID: "+ getId() + ",name: "+ getName()+  ",age: "+ this.age + ".phone: "+ this.phone; 
	}
	
	@Test
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int[] mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i < doDaiMang; i++) {
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: " + i);
			mangSoNguyen[i] = scanner.nextInt();

		}
		inMang(mangSoNguyen);
		
	}
	public static void inMang(int[] mangSoNguyen) {
		System.out.println("Độ dài của mảng " + mangSoNguyen.length);
		System.out.println("Các giá trị của mảng vừa nhập là: ");
		for (int i = 0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}
	@AfterMethod
	public void closebrower() {
		System.out.println("This method to close chrome brower");
	}
}
