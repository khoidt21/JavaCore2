import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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

		/*
		 * Cho phép người dùng nhập vào một loạt các số nguyên bất kỳ nằm trong khoảng 0
		 * đến 50. Khi kết thúc nhập, chương trình sẻ hiện ra các giá trị đã nhập(Không
		 * lặp lại ) và số lần xuất hiện của nó.
		 * 
		 * VD: Nhập vào 1 2 3 4 1 2 Xuất ra 1, 2, 3 số 1 xuất hiện 2 lần. số 2 xuất hiện
		 * 2 lần. số 3 xuất hiện 1 lần. số 4 xuất hiện 1 lần.
		 */
		// {2,2,1,1,0,0}
		
		
		
		System.out.println("Nhap chuoi can dem vao mang");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
//		sc.nextLine();
//		Object a[] = new Object[s];
//		int temp[] = new int[s];
		
		//System.out.println("Nhap phan tu cua mang");
//		for (i = 0; i < n; i++) {
//			a[i] = sc.nextLine();
//			
//			
//	
		String[] ar = s.split("\\s+");//{"abc", "de", "f"}
		String[] ar2 = s.replaceAll("\\s+", "").split("");
		
		
//		char[] s1 = s.toCharArray();
		
		//{'a', 'b'} - > {"a", "b"}
		//String [] chuoicantim = convertChar(s1, ar.length - 1);
		
		System.out.println("-------------Dem ky tu--------------------");
		demSoPhanTu(ar2);
		
		// dem so phan tu
		System.out.println("-------------Dem tu--------------------");
		demSoPhanTu(ar);

	}
	
	public static String[] convertChar(char[] a, int n) {
		 String[] b = new String[a.length - n];
		 int j = 0;
		 while(j < b.length) {
			 for(int i=0;i<a.length;i++) {
				  if(a[i] !=' ') {
					  b[j] = String.valueOf(a[i]);
					  j++;
				  } 
			 }
		 }
		 return  b;
	}

	public static void demSoPhanTu(Object a[]) {

		// xu ly dem
		int i, j;
		int temp[] = new int[a.length];
		for (i = 0; i < a.length; i++) {
			boolean isCount = true;
			for (j = 0; j < a.length; j++) {
				if (temp[j] != 0 && a[j].equals(a[i])) {
					isCount = false;
					break;
				}
			}

			// neu phan tu a[i] chua duoc dem thi di dem
			if (isCount) {
				int count = 0;
				for (int k = 0; k < a.length; k++) {
					if (a[i].equals(a[k])) {
						count++;
					}
				}
				temp[i] = count;
			}
		}
		for (i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				System.out.println("Phan tu '" + a[i] + "' xuat hien " + temp[i] + " lan");
			}
		}
	}
}
