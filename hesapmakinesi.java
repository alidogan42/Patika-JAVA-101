package abc;
import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		int n1,n2,islem;
		Scanner hsp=new Scanner(System.in);
		System.out.print("LÜTFEN islem yapak için ilk sayýyý giriniz  :");
		n1=hsp.nextInt();
		System.out.print("LÜTFEN islem yapak için ikinci sayýyý giriniz   :");
		n2=hsp.nextInt();
		
		System.out.println("1-toplama\n 2-cýkarma\n 3-carpma\n4-bolme ");
		System.out.println("islem gir");
		islem=hsp.nextInt();
		
		switch(islem) {
		case(1):
			System.out.println("toplamý"+(n1+n2));
		break;
		case(2):
			System.out.println("cýkarma"+(n1-n2));
		break;
		case(3):
			System.out.println("carpma"+(n1*n2));
		break;
		case(4):
			switch(n2){
			case(0):
				System.out.println("sýfýr bölen olamaz");
			break;
			default:
				System.out.println("bolme "+(n1/n2));
		}
		//System.out.println("bolme "+(n1/n2));
		break;
		default:
			System.out.println("lütfen gecerli bir iþlem giriniz");
	
		}
		
		
		
		
	}

}
