package abc;
import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		int n1,n2,islem;
		Scanner hsp=new Scanner(System.in);
		System.out.print("L�TFEN islem yapak i�in ilk say�y� giriniz  :");
		n1=hsp.nextInt();
		System.out.print("L�TFEN islem yapak i�in ikinci say�y� giriniz   :");
		n2=hsp.nextInt();
		
		System.out.println("1-toplama\n 2-c�karma\n 3-carpma\n4-bolme ");
		System.out.println("islem gir");
		islem=hsp.nextInt();
		
		switch(islem) {
		case(1):
			System.out.println("toplam�"+(n1+n2));
		break;
		case(2):
			System.out.println("c�karma"+(n1-n2));
		break;
		case(3):
			System.out.println("carpma"+(n1*n2));
		break;
		case(4):
			switch(n2){
			case(0):
				System.out.println("s�f�r b�len olamaz");
			break;
			default:
				System.out.println("bolme "+(n1/n2));
		}
		//System.out.println("bolme "+(n1/n2));
		break;
		default:
			System.out.println("l�tfen gecerli bir i�lem giriniz");
	
		}
		
		
		
		
	}

}
