package proje;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("bir sayı gir");
		a = input.nextInt();
		
		switch(a){
		case(1):
			System.out.println("sayı 1");
		break;
		case(2):
			System.out.println("sayı 2");
		break;
		case(3):
			System.out.println("sayı 3");
		break;
		default:
			System.out.println("hatalı değer");
			
		}

	}

}
