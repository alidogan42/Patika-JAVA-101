package abc;
import java.util.Scanner;
public class notortalamas� {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,m�zik;
		
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
		
		System.out.print("nm�zi nkotunuzu giriniz :");
		m�zik=inp.nextInt();
		
		int toplam=(mat+fizik+kimya+turkce+tarih+m�zik);
		double ort=toplam/(6.0);
		
		System.out.println("\n  not ortalamas� " +ort);
		
		boolean str=  60 <= ort;
		String ort1 = str ? "\n  not ortalamas� 60 DAN B�Y�KT�R":" not ortalamas� 60 DAN k�c�KT�R";
		System.out.println(ort1);
		
		
	}

}
