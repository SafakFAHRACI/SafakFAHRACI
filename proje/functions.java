package proje;

public class functions {

	public static void main(String[] args) {
		
		
		int r = power(3,2);
		System.out.println(r);

	}
	
	static int power(int sayi, int kuvvet) {
		
		int result = 1;
		for(int i = 1; i <= kuvvet; i++) {
			
			result *= sayi;
			
		}
		System.out.println(result);
		return result;
		
	}
	

}
