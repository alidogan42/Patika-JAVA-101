package abc;
import java.util.Scanner;
public class notortalamasý {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,müzik;
		
		Scanner inp=new Scanner(System.in);
		System.out.print("MAT notunuzu giriniz :");
		mat=inp.nextInt();
		//System.out.println(mat);
		System.out.print("fizik notunuzu giriniz :");
		fizik=inp.nextInt();
		
		System.out.print("kimya notunuzu giriniz :");
		kimya=inp.nextInt();
		
		System.out.print("turkce notunuzu giriniz :");
		turkce=inp.nextInt();
		
		System.out.print("tarih notunuzu giriniz :");
		tarih=inp.nextInt();
		
		System.out.print("nmüzi nkotunuzu giriniz :");
		müzik=inp.nextInt();
		
		int toplam=(mat+fizik+kimya+turkce+tarih+müzik);
		double ort=toplam/(6.0);
		
		System.out.println("\n  not ortalamasý " +ort);
		
		boolean str=  60 <= ort;
		String ort1 = str ? "\n  not ortalamasý 60 DAN BÜYÜKTÜR":" not ortalamasý 60 DAN kÜcÜKTÜR";
		System.out.println(ort1);
		
		
	}

}
