package abc;
import java.util.Scanner;
public class ushesaplama {
	
	public static void main(String[] args) {
		
		int n,r,t=1;
		Scanner p=new Scanner(System.in);
		System.out.println("�ss� hesaplanacak n degerini giriniz");
		
		n=p.nextInt();
		System.out.println("�s olacak r degerini giriniz");
		r=p.nextInt();
		
		for(int i=1;i<=r;i++) {
			t*=n;
			
		}
		System.out.println(n+" �ss� "+r+" = "+t);
}

}

	
	
	
	

		
