package proje;

public class loops {

	public static void main(String[] args) {
		
		int i=0;
		while(i<=5) {
			System.out.println(i);
			i++;
			
		} 
		do {
			
			i++;
			System.out.println(i);
		}while(i>=10);
		
		while (true) {
			
			i++;
			System.out.println(i);
			if (i==50) {
				break;
			}
			
		}

	}

}
