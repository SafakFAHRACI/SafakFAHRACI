package proje;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quiz,vize,but;
		System.out.println("quiz gir");
		quiz = input.nextInt();
		System.out.println("vize gir");
		vize = input.nextInt();
		System.out.println("but gir");
		but = input.nextInt();
		
		double ort;
		ort = ((quiz*0.2)+(vize*0.35)+(but*0.45));
		System.out.println(ort);
		boolean sonuc = (ort<50);
		String durum = sonuc ? "kaldı" : "geçti";
		System.out.println(durum);
		
		
		
		

	}

}
