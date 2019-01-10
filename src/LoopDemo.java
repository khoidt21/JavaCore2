import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//viet chuong trinh cho nguoi dung nhap vao khong gioi han
		//cac so nguyen cho den khi nao nguoi dung nhap so 0 thì dung lai
		//va sau khi dung lai tinh tong cac so nguoi dung da nhap
		
		System.out.println("Nhập vào dãy số cho đến số 0:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int max = 0;
		max += number;
//		do {
//			number = scan.nextInt();
//			max +=number;
//		} while(number != 0);
		
		while(number != 0) {
			number = scan.nextInt();
			max +=number;
		}
		
		System.out.println("Tong cac so vua nhap "+max);
		System.out.println("Ket thuc");
	}

}
