package proje;

public class AmstrongSayılar {

	public static void main(String[] args) {
//123%10 = 3
//123 / 10 = 12
// 12 % 10 = 2
		int temp,say1,say10,say100,top;
		for(int i = 100;i<1000;i++) {
			
			temp = i;
			say1 = temp%10;
			temp = temp/10;
			say10 = temp%10;
			say100 = temp/10;
			
			top = (say1*say1*say1) + (say10*say10*say10) + (say100*say100*say100);
			
			if (i==top) {
				System.out.println("Amstong sayı :" + i);
				
			}
			
			
				
			
			
			
		}

	}

}
