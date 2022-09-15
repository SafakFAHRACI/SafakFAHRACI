package proje;

import java.util.Scanner;

public class Hesapmakinesi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double sayi1,sayi2;
		String islem;
		System.out.println("işlem karakteri");
		islem = input.next();
		System.out.println("1. sayıyı gir");
		sayi1 = input.nextInt();
		System.out.println("2. sayıyı gir");
		sayi2 = input.nextInt();
		
		if (islem.equals("*")) {
			System.out.print("çarpma");
			System.out.print((sayi1*sayi2));
						
		}
		else if (islem.equals("/")){
			double bolme = sayi1/sayi2;
			System.out.print("bölme : ");
			System.out.print(bolme);
			
			}
		else if (islem.equals("+")) {
			
			System.out.print("toplama : ");
			System.out.print(sayi1+sayi2);
			
		}
		

	}

}
