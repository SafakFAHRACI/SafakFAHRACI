package proje;

public class op {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int na = a+b;
		
		System.out.println(na);
		
		boolean kosul = (b/a)==2;
		System.out.println(kosul);
		
		boolean kosul2 = a < 40 && b < 1;
		System.out.println(kosul2);
		
		boolean kosul3 = a > 3 || b > 11;
		System.out.println(kosul3);
		
		String sonuc = kosul2 ? "doğru" : "yanlış";
		System.out.println(sonuc);

	}

}
