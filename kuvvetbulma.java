package abc;
import java.util.Scanner;
public class kuvvetbulma {

	public static void main(String[] args) {
		int n;
		Scanner p=new Scanner(System.in);
		System.out.println("sýnýrý giriniz");
		n=p.nextInt();
		for(int i=1;i<=n;i*=4) {
			System.out.println("sonuclar"+i);
		}
		for(int k=1;k<=n;k*=5) {
		System.out.println("sonuc 5kuvvetleri"+k);

	}

}}
