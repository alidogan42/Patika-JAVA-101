package abc;
import java.util.Scanner;
public class s�ralama {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("lutfen a say�s�n� giriniz");
		a=inp.nextInt();
		System.out.println("lutfen b say�s�n� giriniz");
		b=inp.nextInt();
		System.out.println("lutfen c say�s�n� giriniz");
		c=inp.nextInt();
		
		if(a>b&&a>c) {
			if(b>c){
				System.out.println(" s�ralama   a>b>c");
			}
			else {
				System.out.println("s�ralama   a>c>b");
			}
		}else if(b>c&&b>a) {
			if(c>a) {
				System.out.println("s�ralam b>c>a");
			}else {
				System.out.println("s�ralama   b>a>c");
			}
		}else if(c>a&&c>b) {
			if(a>b) {
				System.out.println("s�ralama  c>a>b");
			}else {
				System.out.println("s�ralama   c>b>a");
			}
		}

	}

}
