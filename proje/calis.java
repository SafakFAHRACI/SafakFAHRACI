package proje;

public class calis {

	public static void main(String[] args) {
		
		for (int i=0;i<=5;i++)
		{
			if(i==2 || i==4) {
				System.out.println("atladı : "+i);
				continue;
			}
			System.out.println(i);
		
		}
	}

}
