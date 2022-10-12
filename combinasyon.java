package abc;
import java.util.Scanner;
public class combinasyon {

	public static void main(String[] args) {
		int n,r,t1=1,t2=1,t3=1,comb;
		Scanner p=new Scanner(System.in);
		System.out.println("combinasyonu hesaplanacak n degerini giriniz");
		n=p.nextInt();
		System.out.println("combinasyonu hesaplanacak r degerini giriniz");
		r=p.nextInt();
		
		for(int i=1;i<=n;i++) {
			t1*=i;
			
		}
		System.out.println(n+". faktöriyel  "+t1);
		
		for(int i=1;i<=r;i++) {
			t2*=i;
		}
		System.out.println(r+". faktöriyel  "+t2);
		
		for(int i=1;i<=n-r;i++) {
			t3*=i;	
		}
		System.out.println((n-r)+". faktöriyel  "+t3);
		comb=t1/(t2*t3);
		System.out.println("combinasyon  C(n,r) =  " +comb);
		
		
		
		
		
		
		
		System.out.println("C(n,r) = n! / (r! * (n-r)!)");
}}