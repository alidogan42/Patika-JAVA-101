package abc;
import java.util.Scanner;
public class harmoniksayý {
	
public static void main(String[] args) {
		
		Scanner p=new Scanner(System.in);
		int n,r;
		double result=0;
		System.out.println("harmonik hesaplanacak n degerini giriniz");
		n=p.nextInt();
		
		for(int i=1;i<=n;i++) {
			result+=(1.0/i);
			
		}
		System.out.println(n+"sayýsýnýn harmonik degeri = "+result);
}

}


	
