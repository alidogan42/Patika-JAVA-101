package abc;
import java.util.Scanner;
public class harmoniksay� {
	
public static void main(String[] args) {
		
		Scanner p=new Scanner(System.in);
		int n,r;
		double result=0;
		System.out.println("harmonik hesaplanacak n degerini giriniz");
		n=p.nextInt();
		
		for(int i=1;i<=n;i++) {
			result+=(1.0/i);
			
		}
		System.out.println(n+"say�s�n�n harmonik degeri = "+result);
}

}


	
