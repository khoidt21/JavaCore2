import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class NumberOrder {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap phan tu cua mang ");
		int n = scanner.nextInt();
		int tempSort;
		// khoi tao mang arr
		int[] arr = new int[n];
		System.out.println("Nhap cac phan tu cua mang ");
		
		for(int i=0;i < arr.length;i++) {
			System.out.printf("a[%d] = ",i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("Cac phan tu cua mang ");
		show(arr);
		
		// sap sep theo thu tu giam dan
		for(int i = 0; i < n - 1 ; i++) {
			for(int j = i + 1; j <= n - 1;j++) {
				if(arr[i] < arr[j]) {
					tempSort = arr[i];
					arr[i] = arr[j];
					arr[j] = tempSort;
				}
			}
		}
		System.out.println("Mang sau khi sap sep giam dan ");
		for(int i=0;i < n ;i++) {
			System.out.println(arr[i]);
		}
		// sap sep theo thu tu tang dan 
		for(int i = 0 ; i < n - 1; i++) {
			for(int j = i + 1; j <= n - 1;j++) {
				if(arr[i] > arr[j]) {
					tempSort = arr[i];
					arr[i] = arr[j];
					arr[j] = tempSort;
				}
			}
		}
		System.out.println("Mang sau khi sap sep tang dan ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	// in ra cac phan tu cua mang 
	public static void show(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
