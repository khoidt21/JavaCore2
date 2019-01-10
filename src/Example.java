import java.util.Scanner;

/**
 * 
 */

/**
 * @author ADMIN
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Cho phép người dùng nhập vào một loạt các số nguyên bất kỳ nằm 
	 * trong khoảng 0 đến 50. Khi kết thúc nhập, chương trình sẻ hiện ra 
	 * các giá trị đã nhập(Không lặp lại ) và số lần xuất hiện của nó.
	
	VD: Nhập vào 1 2 3 4 1 2
	Xuất ra 1, 2, 3
	số 1 xuất hiện 2 lần.
	số 2 xuất hiện 2 lần.
	số 3 xuất hiện 1 lần.
	số 4 xuất hiện 1 lần.
	*/	
		int i,n; 
		System.out.println("Enter the number of input");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the inputs");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			System.out.println("Inputs are "+a[i]);
		}
		int t = a[1];
		int count = 0;
		for(i=0;i< n;i++) {
			if(a[i] == t) {
				t = a[i];
				count++;
				
			}
			
		}
		System.out.println("So " + t + " xuat hien " + count + " lan" );
		
	}

}
