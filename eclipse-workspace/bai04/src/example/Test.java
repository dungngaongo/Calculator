package example;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so SV:");
			int N = scanner.nextInt();
			Student[] cls = new Student[N];
			scanner.nextLine();

			for(int i = 0; i < N; ++i) {
				System.out.println("Nhap SV thu " + (i + 1));

				System.out.println("Name: ");
				String name = scanner.nextLine();
				System.out.println("Year: ");
				int year = scanner.nextInt();
				scanner.nextLine();
				cls[i] = new Student(year, name);
			}
			scanner.close();
			int total = 0;
			System.out.println("Danh sach lop: ");
			for(int i = 0; i < N; ++i) {

				total += 2024 - cls[i].getYear();
	
				System.out.println(cls[i].getName());

			}
			System.out.println("Tong so tuoi: " + total);
			}
	

}
