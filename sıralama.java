package abc;
import java.util.Scanner;
public class sýralama {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("lutfen a sayýsýný giriniz");
		a=inp.nextInt();
		System.out.println("lutfen b sayýsýný giriniz");
		b=inp.nextInt();
		System.out.println("lutfen c sayýsýný giriniz");
		c=inp.nextInt();
		
		if(a>b&&a>c) {
			if(b>c){
				System.out.println(" sýralama   a>b>c");
			}
			else {
				System.out.println("sýralama   a>c>b");
			}
		}else if(b>c&&b>a) {
			if(c>a) {
				System.out.println("sýralam b>c>a");
			}else {
				System.out.println("sýralama   b>a>c");
			}
		}else if(c>a&&c>b) {
			if(a>b) {
				System.out.println("sýralama  c>a>b");
			}else {
				System.out.println("sýralama   c>b>a");
			}
		}

	}

}
