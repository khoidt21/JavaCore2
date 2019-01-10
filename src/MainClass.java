
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cac kieu du lieu so nguyen
		byte a = 5;//1 byte = 8 bit; 1 bit có 2 giá trị (0,1)
		//1 byte là 00000000 -> lưu được 2^8 giá trị = 256 giá trị
		//so be nhat byte lưu được là -128
		//so lon nhat là 127
		short s = 6;
		int i = 7;
		long l = 100;
		
		//cac kieu du lieu so thực
		float f = 2.5f;
		double d = 9.5;
		
		//kieu du lieu dung sai
		boolean b = true;
		
		//kieu ký tự
		char c = 'h';
		
		//kieu chuỗi ký tự
		String ss = "abcxyz";
		
		//cau lenh dieu kien, re nhanh
		if(b) {
			System.out.println("b là đúng");
		} else {
			System.out.println("b là sai");
		}
		
		if(d >= 8) {
			System.out.println("HSG");
		} else if(d >= 7) {
			System.out.println("HS khá");
		} else if(d >= 6) {
			System.out.println("HS TB khá");
		}
		
		if(d >= 8) {
			System.out.println("HSG");
		}
		if(d >= 7) {
			System.out.println("HS khá");
		}
		if(d >= 6) {
			System.out.println("HS TB khá");
		}
		
		//vong lap
		for(int j = 0; j < 6; j++) {
			System.out.println(j);
		}
		
		
		//mang 1 chieu
		int[] array = new int[5];
		array[0] = 9;
		System.out.println(array[1]);
	}

}
