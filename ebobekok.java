package abc;
import java.util.Scanner;
public class ebobekok {

	public static void main(String[] args) {
		int n1,n2;
		int ebob = 0;
		try (Scanner p = new Scanner (System.in)) {
			System.out.println("ebob icin n1 degeri giriniz");
			n1=p.nextInt();
			System.out.println("ebob icin n1 degeri giriniz");
			n2=p.nextInt();
		}
		for(int i=1;i<=n1;i++) {
			if(n1%i==0&&n2%i==0) {
				ebob=i;
				System.out.println(ebob);
				
			}}
			System.out.println("**************");
			int i=1;
			while(i<=(n1*n2)) {
				i++;
				if(i%n1==0&&i%n2==0) {
					System.out.println(i);
				break;
				}
			}
			System.out.println("ekok ="+ (n1*n2) /ebob);
			
		}
		
	
	}


