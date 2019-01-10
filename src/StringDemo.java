import java.util.function.Function;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		String s5 = "abc de      f"; 
		String s2 = new String("abcdef");
		String s3 = "abcdef";
		System.out.println("s: " + s);
		System.out.println("s2: " + s2);		
		if(s.equals(s3)) {//so sanh gia tri cua hai object
			System.out.println("equals: hai chuoi bang nhau");
		}
		if(s == s3) {
			System.out.println("'==': hai chuoi bang nhau");
		}
		
		System.out.println(s.substring(2));//cdef
		System.out.println(s.substring(2, 5));//cde
		System.out.println(s.compareTo("Abe"));// tra ve hieu so giữa số tt của chuỗi 1 - số tt của chuoi 2 dua trên thứ tự từ điển
		System.out.println(s.compareToIgnoreCase("Abe"));
		System.out.println(s.concat("uiu"));// s + "uiu"
		System.out.println(s.contains("cde"));
		System.out.println(s.indexOf("cd"));//2
		System.out.println(s.isEmpty());//kiem trai co phai ""
		System.out.println(s.replace("cd", "pp"));//thay cd bang pp
		System.out.println(s5.replaceAll("\\s+", "_"));//abc_de_f
		String[] ar = s5.split("\\s+");//{"abc", "de", "f"}
		s.toLowerCase();
		s.toUpperCase();
		s.trim();
		
		System.out.println(removeSpace(s5));
		System.out.println("----------------------------");
		System.out.println(excapeLowse("nguyen van bao"));
		
	}
	
	//xoa het cac khoang trang trong chuoi
	private static String removeSpace(String s) {
		return s.replaceAll("\\s+", "");
	}
	
	/*
	 * viet ham chuan hoa chuoi
	 * loai bo khoang trang du thua
	 * va ghi hoa chu cai dau tien của từ
	 * vd: "   nguyen    van     bao   "
	 * -> "Nguyen Van Bao"
	 */
	  
	private static String excapeLowse(String s) {
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
			
		String arr[] = s.split(" ");
		String s1 ="";
		String s2 ="";
		String s3 = "";
		String s5 = "";
		for(int i=0; i < arr.length; i++){
			
			s1 = arr[i].substring(0,1);
		    s1 = s1.toUpperCase();
			s2 = arr[i].substring(1);
			s3 = s1.concat(s2);
			s5 += s3 + " ";
		}
		return s5.trim();
	}
	
    
}
