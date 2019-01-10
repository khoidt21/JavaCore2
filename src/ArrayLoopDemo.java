
public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cho mot mang co 5 so 
		//tim ra so lon nhat cua mang do
		int[] ar = {1, 99, 88, 5, 100, 2};
		int max = 0;
		for(int i = 0; i < ar.length; i++) {
			//System.out.println(ar[i]);
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		
		for(int a : ar) {
			System.out.println(a);
		}
		System.out.println("Phan tu lon nhat cua mang " + max);
	}

}
