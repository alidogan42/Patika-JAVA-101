package abc;
import java.util.Scanner;
public class say�lardateklik {

	public static void main(String[] args) {
		int k,toplam=0;
		
		Scanner p=new Scanner(System.in);
		
		do {
			System.out.println("bir say� giriniz");
			k=p.nextInt();
			if(k%2==0 && k%4==0) {
				toplam +=k;
			
			}
		}while(k%2==0);

		System.out.println("cift ve dordun kat� olan say�lar  "+toplam);
		

	}

}
